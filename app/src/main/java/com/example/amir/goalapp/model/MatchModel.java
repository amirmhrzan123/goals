package com.example.amir.goalapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MatchModel {

@SerializedName("status")
@Expose
private String status;
@SerializedName("message")
@Expose
private String message;
@SerializedName("results")
@Expose
private Results results;

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public String getMessage() {
return message;
}

public void setMessage(String message) {
this.message = message;
}

public Results getResults() {
return results;
}

public void setResults(Results results) {
this.results = results;
}

    public class Results {

        @SerializedName("match")
        @Expose
        private List<List<Match>> match = null;

        public List<List<Match>> getMatch() {
            return match;
        }

        public void setMatch(List<List<Match>> match) {
            this.match = match;
        }
    }


    public class Match {

        @SerializedName("competition-name")
        @Expose
        private String competitionName;
        @SerializedName("match_result")
        @Expose
        private List<Object> matchResult = null;

        public String getCompetitionName() {
            return competitionName;
        }

        public void setCompetitionName(String competitionName) {
            this.competitionName = competitionName;
        }

        public List<Object> getMatchResult() {
            return matchResult;
        }

        public void setMatchResult(List<Object> matchResult) {
            this.matchResult = matchResult;
        }

    }
}