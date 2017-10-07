package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Body1
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-06T21:55:51.718Z")
public class Body1 {
  @SerializedName("transactions")
  private List<DataTransaction> transactions = new ArrayList<DataTransaction>();

  public io.swagger.client.model.Body1 transactions(List<DataTransaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public io.swagger.client.model.Body1 addTransactionsItem(DataTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "")
  public List<DataTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<DataTransaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    io.swagger.client.model.Body1 body1 = (io.swagger.client.model.Body1) o;
    return Objects.equals(this.transactions, body1.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body1 {\n");
    
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

