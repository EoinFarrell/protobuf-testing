# Protobuf Testing

- https://protobuf.dev/getting-started/csharptutorial/#compiling-protocol-buffers
- https://protobuf.dev/downloads/

```bash
protoc --java_out=java/test-app/src/main/java/ addressbook.proto
protoc --csharp_out=csharp addressbook.proto
protoc --python_out=python addressbook.proto
```