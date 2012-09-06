define([ "./lang" ], function(lang) {
	return {

		/**
		 * get the hash code of String, implemented as the hashCode() method of
		 * String in Java
		 * 
		 * @param str
		 * @returns {Number}
		 */
		hashCode : function(str) {
			if (!str) {
				return 0;
			}

			var hash = 0;
			for ( var i = 0; i < str.length; i++) {
				hash = 31 * hash + str.charCodeAt(i);
			}
			return hash;
		},

		substitute : function(str, map, transform) {
			transform = transform || function(v) {
				return v;
			};

			return str.replace(/\$\{([^\s\:\}]+)(?:\:([^\s\:\}]+))?\}/g,
					function(match, key, format) {
						var value = lang.getObject(key, false, map);
						return transform(value, key).toString();
					}); // String
		}
	};
});