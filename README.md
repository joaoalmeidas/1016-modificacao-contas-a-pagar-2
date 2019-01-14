# 1016-modificacao-contas-a-pagar-2
(Modificação no sistema Contas a Pagar) É possível incluir a funcionalidade do aplicativo de folha de pagamento (figuras 10.4 a 10.9)
no aplicativo contas a pagar sem modificar as subclasses Employee SalariedEmployee, HourlyEmployee, CommissionEmployee
ou BasePlusCommissionEmployee. Para fazer isso, modifique a classe Employee (Figura 10.4) para implementar a interface
Payable e declare o método getPaymentAmount para invocar o método earnings. O método getPaymentAmount passaria então
a ser herdado pelas subclasses na hierarquia Employee. Quando getPaymentAmount é chamado para um objeto de subclasse particular, ele invoca polimorficamente o método de earnings adequado para a subclasse. Reimplemente a Questão 10.15 usando a hierarquia
Employee original a partir do aplicativo de folha de pagamento das figuras 10.4 a 10.9. Modifique a classe Employee como descrito
nesta questão, e não modifique nenhuma das subclasses da classe Employee.
