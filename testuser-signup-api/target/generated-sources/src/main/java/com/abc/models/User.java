package com.abc.models;

import java.util.Objects;
import com.abc.models.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-30T17:22:19.547-07:00[America/Los_Angeles]")
public class User   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("registered_at")
  private LocalDateTime registeredAt = null;

  @JsonProperty("first_name")
  private String firstName = null;

  @JsonProperty("last_name")
  private String lastName = null;

  @JsonProperty("instagram_username")
  private String instagramUsername = null;

  @JsonProperty("twitter_username")
  private String twitterUsername = null;

  @JsonProperty("development_environment")
  private String developmentEnvironment = null;

  @JsonProperty("address")
  private Address address = null;

  public User id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(readOnly = true, value = "")
  
    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "anath04jgec@gmail.com", required = true, value = "")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User registeredAt(LocalDateTime registeredAt) {
    this.registeredAt = registeredAt;
    return this;
  }

  /**
   * Get registeredAt
   * @return registeredAt
  **/
  @ApiModelProperty(readOnly = true, value = "")
  
    @Valid
    public LocalDateTime getRegisteredAt() {
    return registeredAt;
  }

  public void setRegisteredAt(LocalDateTime registeredAt) {
    this.registeredAt = registeredAt;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "John", required = true, value = "")
      @NotNull

  @Size(min=1,max=100)   public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "Lenon", required = true, value = "")
      @NotNull

  @Size(min=1,max=100)   public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User instagramUsername(String instagramUsername) {
    this.instagramUsername = instagramUsername;
    return this;
  }

  /**
   * Get instagramUsername
   * @return instagramUsername
  **/
  @ApiModelProperty(example = "john_lenon", required = true, value = "")
      @NotNull

  @Size(min=1,max=100)   public String getInstagramUsername() {
    return instagramUsername;
  }

  public void setInstagramUsername(String instagramUsername) {
    this.instagramUsername = instagramUsername;
  }

  public User twitterUsername(String twitterUsername) {
    this.twitterUsername = twitterUsername;
    return this;
  }

  /**
   * Get twitterUsername
   * @return twitterUsername
  **/
  @ApiModelProperty(example = "johnlenon", required = true, value = "")
      @NotNull

  @Size(min=1,max=100)   public String getTwitterUsername() {
    return twitterUsername;
  }

  public void setTwitterUsername(String twitterUsername) {
    this.twitterUsername = twitterUsername;
  }

  public User developmentEnvironment(String developmentEnvironment) {
    this.developmentEnvironment = developmentEnvironment;
    return this;
  }

  /**
   * Get developmentEnvironment
   * @return developmentEnvironment
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Size(min=1,max=100)   public String getDevelopmentEnvironment() {
    return developmentEnvironment;
  }

  public void setDevelopmentEnvironment(String developmentEnvironment) {
    this.developmentEnvironment = developmentEnvironment;
  }

  public User address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.registeredAt, user.registeredAt) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.instagramUsername, user.instagramUsername) &&
        Objects.equals(this.twitterUsername, user.twitterUsername) &&
        Objects.equals(this.developmentEnvironment, user.developmentEnvironment) &&
        Objects.equals(this.address, user.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, registeredAt, firstName, lastName, instagramUsername, twitterUsername, developmentEnvironment, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    registeredAt: ").append(toIndentedString(registeredAt)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    instagramUsername: ").append(toIndentedString(instagramUsername)).append("\n");
    sb.append("    twitterUsername: ").append(toIndentedString(twitterUsername)).append("\n");
    sb.append("    developmentEnvironment: ").append(toIndentedString(developmentEnvironment)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
