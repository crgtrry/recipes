 package com.group7.recipes.security;

 import java.util.Set;

 import jakarta.validation.constraints.Email;
 import jakarta.validation.constraints.NotBlank;
 import jakarta.validation.constraints.Size;

 import org.springframework.data.annotation.Id;
 import org.springframework.data.mongodb.core.mapping.DBRef;
 import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
 import lombok.Builder;
 import lombok.Data;
 import lombok.NoArgsConstructor;

 @Data
 @NoArgsConstructor
 @AllArgsConstructor
 @Builder
 @Document(collection = "Users")
 public class User {
   @Id
   private Long id;

   @NotBlank
   @Size(max = 20)
   private String username;

   @NotBlank
   @Size(max = 50)
   @Email
   private String email;

   @NotBlank
   @Size(max = 120)
   private String password;

   @DBRef
   private Set<UserRole> roles;
 }