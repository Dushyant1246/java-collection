package com.bridgelabz.votingSystem;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteMap = new HashMap<>();
    private Map<String, Integer> voteOrder = new LinkedHashMap<>();
    private Map<String, Integer> sortedVotes = new TreeMap<>();

    // Cast a vote
    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteOrder.getOrDefault(candidate, 0) + 1);
        sortedVotes.put(candidate, sortedVotes.getOrDefault(candidate, 0) + 1);
    }

    // Display votes in insertion order
    public void displayVotesInOrder() {
        System.out.println("\nVotes in Order of Casting:");
        voteOrder.forEach((candidate, votes) -> System.out.println(candidate + ": " + votes));
    }

    // Display sorted results
    public void displaySortedResults() {
        System.out.println("\nSorted Voting Results:");
        sortedVotes.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
