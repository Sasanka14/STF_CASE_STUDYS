# simple_http_server.py

"""
Concepts:
- http.server module
- custom request handler class
- working with URL paths
"""

from http.server import BaseHTTPRequestHandler, HTTPServer
import json


class SimpleHandler(BaseHTTPRequestHandler):
    def _send_json(self, data, status=200):
        body = json.dumps(data).encode("utf-8")
        self.send_response(status)
        self.send_header("Content-Type", "application/json")
        self.send_header("Content-Length", str(len(body)))
        self.end_headers()
        self.wfile.write(body)

    def do_GET(self):
        if self.path == "/":
            self._send_json({"message": "Hello from Python HTTP server"})
        elif self.path == "/status":
            self._send_json({"status": "ok"})
        else:
            self._send_json({"error": "Not found"}, status=404)


def run_server(port=8000):
    server_address = ("", port)
    httpd = HTTPServer(server_address, SimpleHandler)
    print(f"Serving on http://localhost:{port}")
    httpd.serve_forever()


if __name__ == "__main__":
    run_server()
