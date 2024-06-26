-- Delete a specific cat by CatID
-- can't be executed, because there is a foreign key constraint, so I deleted related to this cat visit first
DELETE FROM Cats
WHERE CatID = 1;

DELETE FROM Visits
WHERE CatID = 1;

-- Delete all cats of a specific breed
-- can't be executed, because there is a foreign key constraint, so I deleted related to this cat visit first
DELETE FROM Cats
WHERE Breed = 'Siamese';

DELETE FROM Visits
WHERE CatID = (SELECT CatID FROM Cats WHERE Breed = 'Siamese');


-- Delete all visits for a specific cat based on the cat's name
DELETE FROM Visits
WHERE CatID IN (SELECT CatID FROM Cats WHERE Name = 'Whiskers');

-- Delete all medical records for cats owned by a specific owner
DELETE MedicalRecords
FROM MedicalRecords
JOIN Visits ON MedicalRecords.VisitID = Visits.VisitID
JOIN Cats ON Visits.CatID = Cats.CatID
JOIN Owners ON Cats.OwnerID = Owners.OwnerID
WHERE Owners.Name = 'Alice Johnson';

-- Delete all records of visits that occurred before a specific date
DELETE FROM Visits
WHERE VisitDate < '2024-01-01';

