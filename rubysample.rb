require 'pg'

conn = PG::Connection.open(:dbname => 'test')
res = conn.exec "SELECT * FROM t WHERE name = '#{params[:user]}'"

redirect_to request.env[:url]

render text: "<div>#{params[:name]}</div>"
