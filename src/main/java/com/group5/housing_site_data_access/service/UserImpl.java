package com.group5.housing_site_data_access.service;

import com.group5.housing_site_data_access.GetUserByIdRequest;
import com.group5.housing_site_data_access.GetUserByIdResponse;
import com.group5.housing_site_data_access.Model.User;
import com.group5.housing_site_data_access.UserServiceGrpc;
import com.group5.housing_site_data_access.dataAccess.DBUser;
import io.grpc.stub.StreamObserver;

public class UserImpl extends UserServiceGrpc.UserServiceImplBase {

    public void getUserById(GetUserByIdRequest request, StreamObserver<GetUserByIdResponse> responseStreamObserver){
        try{

            System.out.println("Received Request ====> " + request.toString());
            User user = DBUser.getUserById(request.getUserId());

            GetUserByIdResponse.Builder builder = GetUserByIdResponse.newBuilder();
            builder.setId(user.getId());
            builder.setName(user.getName());
            builder.setSurname(user.getSurname());
            builder.setEmail(user.getEmail());
            GetUserByIdResponse responseText = builder.build();
            responseStreamObserver.onNext(responseText);
            responseStreamObserver.onCompleted();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
