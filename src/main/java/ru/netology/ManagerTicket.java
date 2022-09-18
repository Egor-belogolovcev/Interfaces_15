package ru.netology;

import ru.netology.repository.*;

import static java.lang.System.in;

import java.util.Arrays;
import java.util.Objects;

public class ManagerTicket {
    private RepositoryTicket repo;

    public ManagerTicket(RepositoryTicket repo) {
        this.repo = repo;
    }

    public void save(Ticket ticket) {
        repo.add(ticket);
    }

    public Ticket[] findAll(String airportDeparture, String airportArrival) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repo.ticketSet()) {
            if (Objects.equals(ticket.getAirportArrival(), airportArrival) && Objects.equals(ticket.getAirportDeparture(), airportDeparture)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;

            }
            Arrays.sort(result);
        }
        return result;
    }
}