# Account Examples

## Get

```go
    package appwrite-get

    import (
        "fmt"
        "os"
        "github.com/appwrite/go-sdk"
    )

    func main() {
        // Create a Client
        var clt := appwrite.Client{}

        // Set Client required headers
        clt.SetProject("")

        // Create a new Account service passing Client
        var srv := appwrite.Account{
            client: &clt
        }

        // Call Get method and handle results
        var res, err := srv.Get()
        if err != nil {
            panic(err)
        }

        fmt.Println(res)
    }
```