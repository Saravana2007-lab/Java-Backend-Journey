package Projects.src.repository;

import java.util.ArrayList;
import Projects.src.model.TransferRequest;

public class TransferRepository {
    private final ArrayList<TransferRequest> transfers = new ArrayList<>();

    public void save(TransferRequest transfer) {
        if (transfer == null) {
            throw new IllegalArgumentException("Transfer cannot be null");
        }
        transfers.add(transfer);
    }

    public TransferRequest findByTransactionId(String transactionId) {
        if (transactionId == null || transactionId.isBlank()) {
            return null;
        }

        for (TransferRequest transfer : transfers) {
            if (transfer.getTransactionId() != null && transfer.getTransactionId().equals(transactionId)) {
                return transfer;
            }
        }
        return null;
    }

    public ArrayList<TransferRequest> findAll() {
        return transfers;
    }
}
