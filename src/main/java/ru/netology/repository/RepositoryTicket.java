package ru.netology.repository;

import ru.netology.Ticket;

public class RepositoryTicket {
    private Ticket[] tickets = new Ticket[0];

    public void add(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];


        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;

    }

    public Ticket[] ticketSet() {
        return tickets;

    }

    public Ticket[] removeId(int id) {
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int index = 0;
        for (Ticket ticket :
                tickets) {
            if (ticket.getId() != id) {
                tmp[index] = ticket;
                index++;
            }

        }
        tickets = tmp;
        return tickets;
    }
}