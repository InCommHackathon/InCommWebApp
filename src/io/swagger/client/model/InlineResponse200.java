package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-06T21:55:51.718Z")
public class InlineResponse200 {
  @SerializedName("transactions")
  private List<Transaction> transactions = new ArrayList<Transaction>();

  @SerializedName("nextPageCursor")
  private String nextPageCursor = null;

  public io.swagger.client.model.InlineResponse200 transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public io.swagger.client.model.InlineResponse200 addTransactionsItem(Transaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(value = "")
  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }

  public io.swagger.client.model.InlineResponse200 nextPageCursor(String nextPageCursor) {
    this.nextPageCursor = nextPageCursor;
    return this;
  }

   /**
   * This field can be sent with the next request to get the next page of transactions. When there are no more transactions, this field will be an empty string.
   * @return nextPageCursor
  **/
  @ApiModelProperty(value = "This field can be sent with the next request to get the next page of transactions. When there are no more transactions, this field will be an empty string.")
  public String getNextPageCursor() {
    return nextPageCursor;
  }

  public void setNextPageCursor(String nextPageCursor) {
    this.nextPageCursor = nextPageCursor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    io.swagger.client.model.InlineResponse200 inlineResponse200 = (io.swagger.client.model.InlineResponse200) o;
    return Objects.equals(this.transactions, inlineResponse200.transactions) &&
        Objects.equals(this.nextPageCursor, inlineResponse200.nextPageCursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions, nextPageCursor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    nextPageCursor: ").append(toIndentedString(nextPageCursor)).append("\n");
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

