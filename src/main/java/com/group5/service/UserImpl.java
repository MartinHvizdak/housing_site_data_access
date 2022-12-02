package com.group5.service;
import com.group5.proto.User.*;
import com.group5.Model.User;
import com.group5.repository.UserRepository;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class UserImpl extends UserServiceGrpc.UserServiceImplBase {

    UserRepository userRepository;

    public UserImpl(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }
    public void getUserById(GetUserByIdRequest request, StreamObserver<GetUserByIdResponse> responseStreamObserver){
        try{

            System.out.println("Received Request ====> " + request.toString());
            User user = userRepository.findById(request.getUserId()).get();

            GetUserByIdResponse response= GetUserByIdResponse.newBuilder()
                    .setId(user.getId())
                    .setName(user.getName())
                    .setSurname(user.getSurname())
                    .setEmail(user.getEmail())
                    .build();

            responseStreamObserver.onNext(response);
            responseStreamObserver.onCompleted();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}
