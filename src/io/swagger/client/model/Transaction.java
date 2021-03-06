package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-06T21:55:51.718Z")
public class Transaction {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("counterParty")
  private String counterParty = null;

  /**
   * Debit reduces account balance by amount. Credit increases account balance by amount.
   */
  public enum TypeEnum {
    @SerializedName("debit")
    DEBIT("debit"),
    
    @SerializedName("credit")
    CREDIT("credit");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * Always posted
   */
  public enum StatusEnum {
    @SerializedName("posted")
    POSTED("posted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = StatusEnum.POSTED;

  @SerializedName("description")
  private String description = null;

  @SerializedName("amount")
  private Long amount = null;

  @SerializedName("date")
  private String date = null;

   /**
   * Transaction identifier.
   * @return id
  **/
  @ApiModelProperty(value = "Transaction identifier.")
  public Long getId() {
    return id;
  }

   /**
   * Identifier of initiating party.
   * @return counterParty
  **/
  @ApiModelProperty(value = "Identifier of initiating party.")
  public String getCounterParty() {
    return counterParty;
  }

  public io.swagger.client.model.Transaction type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Debit reduces account balance by amount. Credit increases account balance by amount.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Debit reduces account balance by amount. Credit increases account balance by amount.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

   /**
   * Always posted
   * @return status
  **/
  @ApiModelProperty(value = "Always posted")
  public StatusEnum getStatus() {
    return status;
  }

  public io.swagger.client.model.Transaction description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Transaction description.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Transaction description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public io.swagger.client.model.Transaction amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Transaction amount represented in cents (USD). An amount of USD $5.99 is represented as 599.
   * minimum: 0
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Transaction amount represented in cents (USD). An amount of USD $5.99 is represented as 599.")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

   /**
   * Date and time transaction posted to account
   * @return date
  **/
  @ApiModelProperty(value = "Date and time transaction posted to account")
  public String getDate() {
    return date;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    io.swagger.client.model.Transaction transaction = (io.swagger.client.model.Transaction) o;
    return Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.counterParty, transaction.counterParty) &&
        Objects.equals(this.type, transaction.type) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.date, transaction.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, counterParty, type, status, description, amount, date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    counterParty: ").append(toIndentedString(counterParty)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

