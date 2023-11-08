package io.github.ismaelE77.tacocloud;

import io.github.ismaelE77.tacocloud.Interfaces.IngredientRepository;
import io.github.ismaelE77.tacocloud.tacos.Ingredient;
import io.github.ismaelE77.tacocloud.tacos.Ingredient.Type;
import io.livekit.server.*;
import io.pebbletemplates.pebble.extension.Extension;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.google.protobuf.util.JsonFormat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import livekit.LivekitModels.Room;
import livekit.LivekitRoom;
import livekit.LivekitModels;
import org.springframework.context.annotation.Bean;
import retrofit2.Call;
import retrofit2.Response;



@SpringBootApplication
public class TacoCloudApplication {


	public static void main(String[] args) throws IOException {
		SpringApplication.run(TacoCloudApplication.class, args);

//		RoomServiceClient roomServiceClient = RoomServiceClient.create(
//				"http://localhost:7880/",
//				"devkey",
//				"secret");
//
//
//		Call<LivekitModels.Room> call = roomServiceClient.createRoom("Taco", 2 * 60 * 60);
//		Response<LivekitModels.Room> response = call.execute(); // Use call.enqueue for async
//		LivekitModels.Room room = response.body();

//		System.out.println(roomServiceClient.deleteRoom("TESSST").execute().isSuccessful());
//
//		call = roomServiceClient.createRoom("Taco",10 * 60);
//		response = call.execute(); // Use call.enqueue for async
//		List<LivekitModels.ParticipantInfo> users = roomServiceClient.listParticipants("Taco").execute().body();
//		for (var r : users) {
//			System.out.println(r.getName());
//		}
//
//		Call<List<Room>> calls = roomServiceClient.listRooms();
//		Response<List<Room>> responses  = calls.execute();
//		List<Room> rooms = responses.body();
//
//		// Print the names of all rooms.
//		for (Room r : rooms) {
//			System.out.println(r.getName());
//
//		}
//
//
//		AccessToken token = new AccessToken("devkey", "secret");
//
//		token.setName("Ismael");
//		token.setIdentity("190735");
//		token.setMetadata("metadata");
//		token.addGrants(new RoomJoin(true), new RoomName("Taco") , new CanPublish(false) , new CanPublishData(true));
//
//		System.out.println("New access token: " + token.toJwt());
	}

}
