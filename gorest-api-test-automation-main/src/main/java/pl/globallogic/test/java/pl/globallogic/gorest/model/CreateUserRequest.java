package pl.globallogic.gorest.model;

public record CreateUserRequest(String name, String email, String gender, String status) {
}
