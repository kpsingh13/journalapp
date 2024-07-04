package net.engineeringdigest.journalApp.repository;


import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
//import  org. springframework. boot. autoconfigure. data. AbstractRepositoryConfigurationSourceSupport

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String>{
}
