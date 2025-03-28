package com.bridgelabz.votingSystem;

public class MainVoting {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Sample voting
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");

        votingSystem.displayVotesInOrder();
        votingSystem.displaySortedResults();
    }
}
/*
Votes in Order of Casting:
Alice: 2
Bob: 2
Charlie: 1

Sorted Voting Results:
Alice: 2
Bob: 2
Charlie: 1
 */