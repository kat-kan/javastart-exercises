package Exceptions2;

class Competition {
    private String name;
    private Participant[] participants;
    private int ageLimit;
    private int size;

    public Competition(String name, int maxParticipants, int ageLimit) {
        this.name = name;
        if (ageLimit < 0){
            throw new IllegalArgumentException("Podano ujemny limit wieku");
        }
        else {
            this.ageLimit = ageLimit;
        }
        this.participants = new Participant[maxParticipants];
    }

    void addParticipant(Participant participant) {
        if (participant.getAge() < ageLimit) {
            throw new AgeViolationException(ageLimit);
        }
        if (size == participants.length) {
            throw new MaxCompetitorsException(participants.length);
        }
        checkDuplicate(participant);
        participants[size] = participant;
        size++;
    }

    private void checkDuplicate(Participant participant){
        for (Participant part: participants
        ) {
            if (participant.getDocumentId().equals(part.getDocumentId())){
                throw new DuplicateException("Ten uczestnik już został zapisany");
            }
        }
    }

    boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zawody ")
                .append(name)
                .append("\n")
                .append("Liczba uczestników: ").append(size);
        for (int i = 0; i < size; i++) {
            builder.append("\n");
            builder.append(" > ");
            builder.append(participants[i].toString());
        }
        return builder.toString();
    }
}
