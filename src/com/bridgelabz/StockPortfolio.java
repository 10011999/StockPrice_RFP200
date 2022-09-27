package com.bridgelabz;

public class StockPortfolio {
    String stockName;
    double numberOfShares;
    double sharePrice;
    double totalSharePrice;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(double numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public double getTotalSharePrice() {
        return totalSharePrice;
    }

    public void setTotalSharePrice(double totalSharePrice) {
        this.totalSharePrice = totalSharePrice;
    }

    @Override
    public String toString() {
        return "StockPortfolio{" +
                "stockName='" + stockName + '\'' +
                ", numberOfShares=" + numberOfShares +
                ", sharePrice=" + sharePrice +
                ", totalSharePrice=" + totalSharePrice +
                '}';
    }
}
