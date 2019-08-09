package com.example.demo;

public class Deposit {


    private Long id;
    private String type;
    private String transactionDate;
    private String status;
    private String medium;
    private Double amount;
    private String description;


    public Long getId(){return id; }
    public void setId(Long id) {this.id = id; }
    public String getType() {return type; }
    public void setType(String type)  {this.type = type; }
    public String getTransactionDate() {return transactionDate;}
    public  void setTransactionDate(String transactionDate) {this.transactionDate = transactionDate;}
    public String getStatus(){return status; }
    public void setStatus(String status) {this.status = status;}
    public String getMedium(){return medium; }
    public void setMedium(String medium) {this.medium = medium;}
    public Double getAmount (){return amount;}
    public void setAmount(Double amount) {this.amount = amount;}
    public String getDescription(){return description;}
    public void setDescription(String description) {this.description = description;}

}
