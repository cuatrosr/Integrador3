package model;

public interface CalculateOp{

  double priceMarketP(Position positionPl, int salaryEm, double averagePl, int amountGoal);
  double priceMarketC(int salaryEm, int yearExp, int amountWinner);
  double starMarketP(Position positionPl, double averagePl, int amountGoal);
  double starMarketC(int amountWinner);
}
