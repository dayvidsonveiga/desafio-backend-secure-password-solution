package br.com.securepassword.controller;

import java.util.List;

public record FailureResponse(List<String> failures) {
}
