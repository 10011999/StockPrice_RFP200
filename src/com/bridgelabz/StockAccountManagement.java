package com.bridgelabz;

import java.util.List;

public class StockAccountManagement {
    public static void main(String[] args) {
        int choice = 0;
        System.out.println("Welcome Stock Management Program");
        //StockManager stockManager = new StockManager();
        StockAccountManagement stockAccountManagement = new StockAccountManagement();
        do {
            System.out.println("Select the operation : " + "\n1.Add Stock" + "\n2.print stock details" + "\n3.Exit program");
            choice = Input.getInt();

            switch (choice) {
                case 1:
                    stockAccountManagement.addStocks();
                    break;
                case 2:
                    stockAccountManagement.printStockDetails();
                    break;
                case 3:
                    System.out.println("Exit ");
                    break;
                default:
                    System.out.println("Not a Valid Data");
            }
        } while (choice != 3);
    }

    public void addStocks() {
        double sumofAllStocks = 0;
        double stockPrice = 0;
        System.out.println("Enter Number of Stocks Add");
        int numberOfStocks = Input.getInt();

        List<StockPortfolio> tempStock = StockList.getStocks();
        for (int i = 0; i < numberOfStocks; i++) {
            StockPortfolio stockPortfolio = new StockPortfolio();

            System.out.println("Enter name of stock");
            stockPortfolio.setStockName(Input.getString());

            System.out.println("Enter Number of Share buy");
            stockPortfolio.setNumberOfShares(Input.getDouble());

            System.out.println("Enter the price of per share");
            stockPortfolio.setSharePrice(Input.getDouble());

            stockPrice = stockPortfolio.getNumberOfShares() * stockPortfolio.getSharePrice();
            stockPortfolio.setTotalSharePrice(stockPrice);

            tempStock.add(stockPortfolio);
            StockList.setStocks(tempStock);
        }
        
    }

    public void printStockDetails() {
        List<StockPortfolio> stockList = StockList.getStocks();
        for (StockPortfolio stock : stockList) {
            System.out.println(stock);
        }
        System.out.println("total value of stock is:" + StockList.getTotalValue());
    }
}