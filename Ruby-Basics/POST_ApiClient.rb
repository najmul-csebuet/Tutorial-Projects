require 'uri'

url = 'http://foourl.com'
uri = URI.parse(url)

data = File.read('file_path')

http = Net::HTTP.new(uri.host, uri.port)

req = Net::HTTP::Post.new(uri.request_uri)
req.body = data
req.content_type = 'audio/amr'

response = http.request(req)
