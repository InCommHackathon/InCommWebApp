package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Account
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-06T21:55:51.718Z")
public class Account {
  @SerializedName("id")
  private String id = null;

  @SerializedName("balance")
  private Long balance = null;

  public io.swagger.client.model.Account id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique account identifier.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique account identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public io.swagger.client.model.Account balance(Long balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Account balance represented in cents (USD). A balance of USD $107.13 is represented as 10713.
   * @return balance
  **/
  @ApiModelProperty(required = true, value = "Account balance represented in cents (USD). A balance of USD $107.13 is represented as 10713.")
  public Long getBalance() {
    return balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    io.swagger.client.model.Account account = (io.swagger.client.model.Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.balance, account.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, balance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

