<?php

use Appwrite\Client;
use Appwrite\Services\Database;

$client = new Client();

$client
    ->setProject('')
;

$database = new Database($client);

$result = $database->updateDocument('[COLLECTION_ID]', '[DOCUMENT_ID]', '{}', [], []);