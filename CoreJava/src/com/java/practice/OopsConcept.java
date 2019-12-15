package com.java.practice;

import java.util.Arrays;

public class OopsConcept {

	public static void main(String[] args) {

		Account a1 = new Account(1111, "saving", 28887.99);
		Account a2 = new Account(1221, "savng", 38567.99);
		Account a3 = new Account(2221, "savng", 3567.99);
		Account a4 = new Account(2231, "savng", 32567.99);

		Account[] c1Accounts = { a1, a2 };
		Account[] c2Accounts = { a3, a4 };

		Customer c1 = new Customer(123, "a", "pune", "m", 29, null, null);
		c1.setAccounts(c1Accounts);
		Customer c2 = new Customer(223, "b", "pune", "f", 20, null, null);
		c2.setAccounts(c2Accounts);

		Bank sbi = new Bank(12345, "SBI", "pune", null, null, null);

		Card card1 = new Card(99999, sbi, 4800, c1.getCustId(), c1.getAccounts()[0].getAccNo());
		Card card2 = new Card(99989, sbi, 4800, c2.getCustId(), c2.getAccounts()[0].getAccNo());
		Card card3 = new Card(29999, sbi, 4800, c1.getCustId(), c1.getAccounts()[1].getAccNo());
		Card card4 = new Card(95999, sbi, 4800, c2.getCustId(), c2.getAccounts()[1].getAccNo());

		Card[] c1Cards = { card1, card3 };
		Card[] c2Cards = { card2, card4 };
		Card[] bankcards = { card1, card2, card3, card4 };
		c1.setCards(c1Cards);
		c2.setCards(c2Cards);

		Customer[] customer = { c1, c2 };
		sbi.setBankCustomer(customer);

		Account bankAccount = new Account(18976, "current", 8900.00);

		sbi.setAccount(bankAccount);
		sbi.setGivenCards(bankcards);

		System.out.println(sbi);

	//	Card duplicateCard = new Card(959555, sbi, 5656, c2.getCustId(), c2.getAccounts()[0].getAccNo());

		ATMServices service = new HDFCBank();
		service.depositAmount(card3, 10000);
		System.out.println(Arrays.toString(sbi.getBankCustomer()));
		service.withdrawAmount(card3, 1000);
		System.out.println(Arrays.toString(sbi.getBankCustomer()));
	}
}

class Customer {
	private int custId;
	private String custName;
	private String custAddress;
	private String gender;
	private int custAge;
	private Account[] accounts;
	private Card[] cards;

	public Customer(int custId, String custName, String custAddress, String gender, int custAge, Account[] accounts,
			Card[] cards) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.gender = gender;
		this.custAge = custAge;
		this.accounts = accounts;
		this.cards = cards;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "\n\tCustomer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress
				+ ", gender=" + gender + ", accounts=" + Arrays.toString(accounts) + ", cards=" + Arrays.toString(cards)
				+ "]";
	}

}

class Account {
	private int accNo;
	private String accType;
	private double accBalance;

	public Account(int accNo, String accType, double accBalance) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.accBalance = accBalance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "\n\t\tAccount [accNo=" + accNo + ", accType=" + accType + ", accBalance=" + accBalance + "]";
	}

}

class Bank {

	private int ifscCode;
	private String bankName;
	private String bankAddress;
	private Customer[] bankCustomer;
	private Account account;
	private Card[] givenCards;

	public Bank(int ifscCode, String bankName, String bankAddress, Customer[] bankCustomer, Account account,
			Card[] givenCards) {
		super();
		this.ifscCode = ifscCode;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankCustomer = bankCustomer;
		this.account = account;
		this.givenCards = givenCards;
	}

	public int getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public Customer[] getBankCustomer() {
		return bankCustomer;
	}

	public void setBankCustomer(Customer[] bankCustomer) {
		this.bankCustomer = bankCustomer;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Card[] getGivenCards() {
		return givenCards;
	}

	public void setGivenCards(Card[] givenCards) {
		this.givenCards = givenCards;
	}

	@Override
	public String toString() {
		return "\n\t\t\t\tBank [ifscCode=" + ifscCode + ", bankName=" + bankName + ", bankAddress=" + bankAddress
				+ ", bankCustomer=" + Arrays.toString(bankCustomer) + ", account=" + account + ", givenCards="
				+ Arrays.toString(givenCards) + "]";
	}

}

class Card {
	private int cardNo;
	private Bank ifscCode;
	private int pin;
	private int custId;
	private int accNo;

	public Card(int cardNo, Bank ifscCode, int pin, int custId, int accNo) {
		super();
		this.cardNo = cardNo;
		this.ifscCode = ifscCode;
		this.pin = pin;
		this.custId = custId;
		this.accNo = accNo;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public Bank getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(Bank ifscCode) {
		this.ifscCode = ifscCode;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	@Override
	public String toString() {
		return "\n\t\t\t\t\t\tCard [cardNo=" + cardNo + ", ifscCode=" + ifscCode.getBankName() + ", pin=" + pin
				+ ", custId=" + custId + ", accNo=" + accNo + "]";
	}

}

interface ATMServices {

	public void depositAmount(Card card, double amount);

	public void withdrawAmount(Card card, double amount);

}

class HDFCBank implements ATMServices {

	@Override
	public void depositAmount(Card card, double amount) {
		if (card != null) {
			Bank bank = card.getIfscCode();

			if (bank != null && amount > 0) {

				Customer[] customers = bank.getBankCustomer();

				for (Customer customer : customers) {

					if (customer != null && customer.getCustId() == card.getCustId()) {
						System.out.println("customer found" + customer);

						boolean flag = checkPin(card, bank);

						if (flag) {
							Account[] accounts = customer.getAccounts();

							for (Account account : accounts) {
								if (account != null && account.getAccNo() == card.getAccNo()) {
									double existingBal = account.getAccBalance();
									existingBal += amount;
									account.setAccBalance(existingBal);
									System.out.println("trasaction completed...");

									return;
								}

							}
						}

						else {
							System.out.println("invalid pin");
						}
						break;

					}
				}
			} else {
				System.out.println("invalid bank or amount");
			}
		} else {
			System.out.println("invalid card");
		}

	}

	private boolean checkPin(Card usercard, Bank bank) {
		Card[] bankCardsInfo = bank.getGivenCards();
		for (Card card : bankCardsInfo) {
			if (card.getCardNo() == usercard.getCardNo() && card.getPin() == usercard.getPin()) {
				return true;
			}

		}
		return false;
	}

	@Override
	public void withdrawAmount(Card card, double amount) {if (card != null) {
		Bank bank = card.getIfscCode();

		if (bank != null && amount > 0) {

			Customer[] customers = bank.getBankCustomer();

			for (Customer customer : customers) {

				if (customer != null && customer.getCustId() == card.getCustId()) {
					System.out.println("customer found" + customer);

					boolean flag = checkPin(card, bank);

					if (flag) {
						Account[] accounts = customer.getAccounts();

						for (Account account : accounts) {
							if (account != null && account.getAccNo() == card.getAccNo()) {
								double existingBal = account.getAccBalance();
								existingBal -= amount;
								account.setAccBalance(existingBal);
								System.out.println("trasaction completed...");

								return;
							}

						}
					}

					else {
						System.out.println("invalid pin");
					}
					break;

				}
			}
		} else {
			System.out.println("invalid bank or amount");
		}
	} else {
		System.out.println("invalid card");
	}

}


}