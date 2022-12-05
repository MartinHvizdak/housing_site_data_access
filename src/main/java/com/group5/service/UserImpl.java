package com.group5.service;
import com.group5.proto.User.*;
import com.group5.Model.User;
import com.group5.repository.UserRepository;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.util.Optional;

@GRpcService
public class UserImpl extends UserServiceGrpc.UserServiceImplBase {

    UserRepository userRepository;

    public UserImpl(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }
    /*
    public void getUserById(GetUserByIdRequest request, StreamObserver<UserResponse> responseStreamObserver){
        try{

            System.out.println("Received Request ====> " + request.toString());
            User user = userRepository.findById(request.getUserId()).get();

            UserResponse response= UserResponse.newBuilder()
                    .setName(user.getName())
                    .setSurname(user.getSurname())
                    .setEmail(user.getEmail())
                    .build();

            responseStreamObserver.onNext(response);
            responseStreamObserver.onCompleted();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }*/
    @Override
    public void RegisterUser(RegistrationInfo info, StreamObserver<UserResponse> responseStreamObserver)
    {
        if(userRepository.findById(info.getEmail()).isPresent())
        {
            throw new RuntimeException();
        }
        User user = new User(info.getName(),info.getSurname(),info.getEmail(),info.getPassword());
        userRepository.save(user);
        UserResponse response=UserResponse.newBuilder().setEmail(user.getEmail()).setName(user.getName()).setSurname(user.getSurname())
                .build();

        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }


    @Override
    public void LoginUser(LoginInfo info, StreamObserver<LoginResponse> responseStreamObserver)
    {
        Optional<User> user=userRepository.findById(info.getEmail());
        LoginResponse loginResponse;
        if(user.isEmpty()||!(user.get().getPassword().equals(info.getPassword())))
        {
            loginResponse=LoginResponse.newBuilder().setIsValid(false).build();
        }
        else
        {
            loginResponse=LoginResponse.newBuilder().setIsValid(true).build();
        }
        responseStreamObserver.onNext(loginResponse);
        responseStreamObserver.onCompleted();
    }
}
