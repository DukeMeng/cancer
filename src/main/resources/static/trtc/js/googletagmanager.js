// Copyright 2012 Google Inc. All rights reserved.
(function () {

    var data = {
        "resource": {
            "version": "1",
            "macros": [],
            "tags": [],
            "predicates": [],
            "rules": []
        },
        "runtime": [
            [], []
        ]


    };
    var aa, ba = this || self, ca = /^[\w+/_-]+[=]{0,2}$/, da = null;
    var fa = function () {
    }, ha = function (a) {
        return "function" == typeof a
    }, ia = function (a) {
        return "string" == typeof a
    }, ja = function (a) {
        return "number" == typeof a && !isNaN(a)
    }, ka = function (a) {
        return "[object Array]" == Object.prototype.toString.call(Object(a))
    }, la = function (a, b) {
        if (Array.prototype.indexOf) {
            var c = a.indexOf(b);
            return "number" == typeof c ? c : -1
        }
        for (var d = 0; d < a.length; d++) if (a[d] === b) return d;
        return -1
    }, ma = function (a, b) {
        if (a && ka(a)) for (var c = 0; c < a.length; c++) if (a[c] && b(a[c])) return a[c]
    }, na = function (a, b) {
        if (!ja(a) ||
            !ja(b) || a > b) a = 0, b = 2147483647;
        return Math.floor(Math.random() * (b - a + 1) + a)
    }, pa = function (a, b) {
        for (var c = new oa, d = 0; d < a.length; d++) c.set(a[d], !0);
        for (var e = 0; e < b.length; e++) if (c.get(b[e])) return !0;
        return !1
    }, ra = function (a, b) {
        for (var c in a) Object.prototype.hasOwnProperty.call(a, c) && b(c, a[c])
    }, sa = function (a) {
        return Math.round(Number(a)) || 0
    }, ta = function (a) {
        return "false" == String(a).toLowerCase() ? !1 : !!a
    }, ua = function (a) {
        var b = [];
        if (ka(a)) for (var c = 0; c < a.length; c++) b.push(String(a[c]));
        return b
    }, va = function (a) {
        return a ?
            a.replace(/^\s+|\s+$/g, "") : ""
    }, wa = function () {
        return (new Date).getTime()
    }, oa = function () {
        this.prefix = "gtm.";
        this.values = {}
    };
    oa.prototype.set = function (a, b) {
        this.values[this.prefix + a] = b
    };
    oa.prototype.get = function (a) {
        return this.values[this.prefix + a]
    };
    oa.prototype.contains = function (a) {
        return void 0 !== this.get(a)
    };
    var xa = function (a, b, c) {
        return a && a.hasOwnProperty(b) ? a[b] : c
    }, ya = function (a) {
        var b = !1;
        return function () {
            if (!b) try {
                a()
            } catch (c) {
            }
            b = !0
        }
    }, za = function (a, b) {
        for (var c in b) b.hasOwnProperty(c) && (a[c] = b[c])
    }, Aa = function (a) {
        for (var b in a) if (a.hasOwnProperty(b)) return !0;
        return !1
    }, Ca = function (a, b) {
        for (var c = [], d = 0; d < a.length; d++) c.push(a[d]), c.push.apply(c, b[a[d]] || []);
        return c
    };/*
 jQuery v1.9.1 (c) 2005, 2012 jQuery Foundation, Inc. jquery.org/license. */
    var Da = /\[object (Boolean|Number|String|Function|Array|Date|RegExp)\]/, Ea = function (a) {
        if (null == a) return String(a);
        var b = Da.exec(Object.prototype.toString.call(Object(a)));
        return b ? b[1].toLowerCase() : "object"
    }, Fa = function (a, b) {
        return Object.prototype.hasOwnProperty.call(Object(a), b)
    }, Ga = function (a) {
        if (!a || "object" != Ea(a) || a.nodeType || a == a.window) return !1;
        try {
            if (a.constructor && !Fa(a, "constructor") && !Fa(a.constructor.prototype, "isPrototypeOf")) return !1
        } catch (c) {
            return !1
        }
        for (var b in a) ;
        return void 0 ===
            b || Fa(a, b)
    }, Ha = function (a, b) {
        var c = b || ("array" == Ea(a) ? [] : {}), d;
        for (d in a) if (Fa(a, d)) {
            var e = a[d];
            "array" == Ea(e) ? ("array" != Ea(c[d]) && (c[d] = []), c[d] = Ha(e, c[d])) : Ga(e) ? (Ga(c[d]) || (c[d] = {}), c[d] = Ha(e, c[d])) : c[d] = e
        }
        return c
    };
    var f = window, u = document, Ia = navigator, Ja = u.currentScript && u.currentScript.src, Ka = function (a, b) {
        var c = f[a];
        f[a] = void 0 === c ? b : c;
        return f[a]
    }, La = function (a, b) {
        b && (a.addEventListener ? a.onload = b : a.onreadystatechange = function () {
            a.readyState in {loaded: 1, complete: 1} && (a.onreadystatechange = null, b())
        })
    }, Ma = function (a, b, c) {
        var d = u.createElement("script");
        d.type = "text/javascript";
        d.async = !0;
        d.src = a;
        La(d, b);
        c && (d.onerror = c);
        var e;
        if (null === da) b:{
            var g = ba.document, h = g.querySelector && g.querySelector("script[nonce]");
            if (h) {
                var k = h.nonce || h.getAttribute("nonce");
                if (k && ca.test(k)) {
                    da = k;
                    break b
                }
            }
            da = ""
        }
        e = da;
        e && d.setAttribute("nonce", e);
        var l = u.getElementsByTagName("script")[0] || u.body || u.head;
        l.parentNode.insertBefore(d, l);
        return d
    }, Na = function () {
        if (Ja) {
            var a = Ja.toLowerCase();
            if (0 === a.indexOf("https://")) return 2;
            if (0 === a.indexOf("http://")) return 3
        }
        return 1
    }, Oa = function (a, b) {
        var c = u.createElement("iframe");
        c.height = "0";
        c.width = "0";
        c.style.display = "none";
        c.style.visibility = "hidden";
        var d = u.body && u.body.lastChild ||
            u.body || u.head;
        d.parentNode.insertBefore(c, d);
        La(c, b);
        void 0 !== a && (c.src = a);
        return c
    }, Pa = function (a, b, c) {
        var d = new Image(1, 1);
        d.onload = function () {
            d.onload = null;
            b && b()
        };
        d.onerror = function () {
            d.onerror = null;
            c && c()
        };
        d.src = a;
        return d
    }, Qa = function (a, b, c, d) {
        a.addEventListener ? a.addEventListener(b, c, !!d) : a.attachEvent && a.attachEvent("on" + b, c)
    }, Ta = function (a, b, c) {
        a.removeEventListener ? a.removeEventListener(b, c, !1) : a.detachEvent && a.detachEvent("on" + b, c)
    }, A = function (a) {
        f.setTimeout(a, 0)
    }, Ua = function (a, b) {
        return a &&
        b && a.attributes && a.attributes[b] ? a.attributes[b].value : null
    }, Va = function (a) {
        var b = a.innerText || a.textContent || "";
        b && " " != b && (b = b.replace(/^[\s\xa0]+|[\s\xa0]+$/g, ""));
        b && (b = b.replace(/(\xa0+|\s{2,}|\n|\r\t)/g, " "));
        return b
    }, Wa = function (a) {
        var b = u.createElement("div");
        b.innerHTML = "A<div>" + a + "</div>";
        b = b.lastChild;
        for (var c = []; b.firstChild;) c.push(b.removeChild(b.firstChild));
        return c
    }, Xa = function (a, b, c) {
        c = c || 100;
        for (var d = {}, e = 0; e < b.length; e++) d[b[e]] = !0;
        for (var g = a, h = 0; g && h <= c; h++) {
            if (d[String(g.tagName).toLowerCase()]) return g;
            g = g.parentElement
        }
        return null
    }, Ya = function (a, b) {
        var c = a[b];
        c && "string" === typeof c.animVal && (c = c.animVal);
        return c
    };
    var Za = /^(?:(?:https?|mailto|ftp):|[^:/?#]*(?:[/?#]|$))/i;
    var $a = {}, ab = function (a, b) {
        $a[a] = $a[a] || [];
        $a[a][b] = !0
    }, bb = function (a) {
        for (var b = [], c = $a[a] || [], d = 0; d < c.length; d++) c[d] && (b[Math.floor(d / 6)] ^= 1 << d % 6);
        for (var e = 0; e < b.length; e++) b[e] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(b[e] || 0);
        return b.join("")
    };
    var db = /:[0-9]+$/, eb = function (a, b, c) {
            for (var d = a.split("&"), e = 0; e < d.length; e++) {
                var g = d[e].split("=");
                if (decodeURIComponent(g[0]).replace(/\+/g, " ") === b) {
                    var h = g.slice(1).join("=");
                    return c ? h : decodeURIComponent(h).replace(/\+/g, " ")
                }
            }
        }, hb = function (a, b, c, d, e) {
            b && (b = String(b).toLowerCase());
            if ("protocol" === b || "port" === b) a.protocol = fb(a.protocol) || fb(f.location.protocol);
            "port" === b ? a.port = String(Number(a.hostname ? a.port : f.location.port) || ("http" == a.protocol ? 80 : "https" == a.protocol ? 443 : "")) : "host" === b &&
                (a.hostname = (a.hostname || f.location.hostname).replace(db, "").toLowerCase());
            var g = b, h, k = fb(a.protocol);
            g && (g = String(g).toLowerCase());
            switch (g) {
                case "url_no_fragment":
                    h = gb(a);
                    break;
                case "protocol":
                    h = k;
                    break;
                case "host":
                    h = a.hostname.replace(db, "").toLowerCase();
                    if (c) {
                        var l = /^www\d*\./.exec(h);
                        l && l[0] && (h = h.substr(l[0].length))
                    }
                    break;
                case "port":
                    h = String(Number(a.port) || ("http" == k ? 80 : "https" == k ? 443 : ""));
                    break;
                case "path":
                    a.pathname || a.hostname || ab("TAGGING", 1);
                    h = "/" == a.pathname.substr(0, 1) ? a.pathname :
                        "/" + a.pathname;
                    var m = h.split("/");
                    0 <= la(d || [], m[m.length - 1]) && (m[m.length - 1] = "");
                    h = m.join("/");
                    break;
                case "query":
                    h = a.search.replace("?", "");
                    e && (h = eb(h, e, void 0));
                    break;
                case "extension":
                    var n = a.pathname.split(".");
                    h = 1 < n.length ? n[n.length - 1] : "";
                    h = h.split("/")[0];
                    break;
                case "fragment":
                    h = a.hash.replace("#", "");
                    break;
                default:
                    h = a && a.href
            }
            return h
        }, fb = function (a) {
            return a ? a.replace(":", "").toLowerCase() : ""
        }, gb = function (a) {
            var b = "";
            if (a && a.href) {
                var c = a.href.indexOf("#");
                b = 0 > c ? a.href : a.href.substr(0, c)
            }
            return b
        },
        ib = function (a) {
            var b = u.createElement("a");
            a && (b.href = a);
            var c = b.pathname;
            "/" !== c[0] && (a || ab("TAGGING", 1), c = "/" + c);
            var d = b.hostname.replace(db, "");
            return {
                href: b.href,
                protocol: b.protocol,
                host: b.host,
                hostname: d,
                pathname: c,
                search: b.search,
                hash: b.hash,
                port: b.port
            }
        };
    var jb = function (a, b, c) {
        for (var d = [], e = String(b || document.cookie).split(";"), g = 0; g < e.length; g++) {
            var h = e[g].split("="), k = h[0].replace(/^\s*|\s*$/g, "");
            if (k && k == a) {
                var l = h.slice(1).join("=").replace(/^\s*|\s*$/g, "");
                l && c && (l = decodeURIComponent(l));
                d.push(l)
            }
        }
        return d
    }, mb = function (a, b, c, d) {
        var e = kb(a, d);
        if (1 === e.length) return e[0].id;
        if (0 !== e.length) {
            e = lb(e, function (g) {
                return g.Bb
            }, b);
            if (1 === e.length) return e[0].id;
            e = lb(e, function (g) {
                return g.Ta
            }, c);
            return e[0] ? e[0].id : void 0
        }
    };

    function nb(a, b, c) {
        var d = document.cookie;
        document.cookie = a;
        var e = document.cookie;
        return d != e || void 0 != c && 0 <= jb(b, e).indexOf(c)
    }

    var rb = function (a, b, c, d, e, g) {
        d = d || "auto";
        var h = {path: c || "/"};
        e && (h.expires = e);
        "none" !== d && (h.domain = d);
        var k;
        a:{
            var l = b, m;
            if (void 0 == l) m = a + "=deleted; expires=" + (new Date(0)).toUTCString(); else {
                g && (l = encodeURIComponent(l));
                var n = l;
                n && 1200 < n.length && (n = n.substring(0, 1200));
                l = n;
                m = a + "=" + l
            }
            var q = void 0, t = void 0, p;
            for (p in h) if (h.hasOwnProperty(p)) {
                var r = h[p];
                if (null != r) switch (p) {
                    case "secure":
                        r && (m += "; secure");
                        break;
                    case "domain":
                        q = r;
                        break;
                    default:
                        "path" == p && (t = r), "expires" == p && r instanceof Date && (r =
                            r.toUTCString()), m += "; " + p + "=" + r
                }
            }
            if ("auto" === q) {
                for (var v = pb(), w = 0; w < v.length; ++w) {
                    var y = "none" != v[w] ? v[w] : void 0;
                    if (!qb(y, t) && nb(m + (y ? "; domain=" + y : ""), a, l)) {
                        k = !0;
                        break a
                    }
                }
                k = !1
            } else q && "none" != q && (m += "; domain=" + q), k = !qb(q, t) && nb(m, a, l)
        }
        return k
    };

    function lb(a, b, c) {
        for (var d = [], e = [], g, h = 0; h < a.length; h++) {
            var k = a[h], l = b(k);
            l === c ? d.push(k) : void 0 === g || l < g ? (e = [k], g = l) : l === g && e.push(k)
        }
        return 0 < d.length ? d : e
    }

    function kb(a, b) {
        for (var c = [], d = jb(a), e = 0; e < d.length; e++) {
            var g = d[e].split("."), h = g.shift();
            if (!b || -1 !== b.indexOf(h)) {
                var k = g.shift();
                k && (k = k.split("-"), c.push({id: g.join("."), Bb: 1 * k[0] || 1, Ta: 1 * k[1] || 1}))
            }
        }
        return c
    }

    var sb = /^(www\.)?google(\.com?)?(\.[a-z]{2})?$/, tb = /(^|\.)doubleclick\.net$/i, qb = function (a, b) {
        return tb.test(document.location.hostname) || "/" === b && sb.test(a)
    }, pb = function () {
        var a = [], b = document.location.hostname.split(".");
        if (4 === b.length) {
            var c = b[b.length - 1];
            if (parseInt(c, 10).toString() === c) return ["none"]
        }
        for (var d = b.length - 2; 0 <= d; d--) a.push(b.slice(d).join("."));
        a.push("none");
        return a
    };
    var Pb = [], Qb = [], Rb = [], Sb = [], Ub = [], Vb = {}, Wb, Xb, Yb, Zb = function (a, b) {
            var c = {};
            c["function"] = "__" + a;
            for (var d in b) b.hasOwnProperty(d) && (c["vtp_" + d] = b[d]);
            return c
        }, $b = function (a, b) {
            var c = a["function"];
            if (!c) throw Error("Error: No function name given for function call.");
            var d = !!Vb[c], e = {}, g;
            for (g in a) a.hasOwnProperty(g) && 0 === g.indexOf("vtp_") && (e[d ? g : g.substr(4)] = a[g]);
            return d ? Vb[c](e) : (void 0)(c, e, b)
        }, bc = function (a, b, c) {
            c = c || [];
            var d = {}, e;
            for (e in a) a.hasOwnProperty(e) && (d[e] = ac(a[e], b, c));
            return d
        },
        cc = function (a) {
            var b = a["function"];
            if (!b) throw"Error: No function name given for function call.";
            var c = Vb[b];
            return c ? c.priorityOverride || 0 : 0
        }, ac = function (a, b, c) {
            if (ka(a)) {
                var d;
                switch (a[0]) {
                    case "function_id":
                        return a[1];
                    case "list":
                        d = [];
                        for (var e = 1; e < a.length; e++) d.push(ac(a[e], b, c));
                        return d;
                    case "macro":
                        var g = a[1];
                        if (c[g]) return;
                        var h = Pb[g];
                        if (!h || b.vc(h)) return;
                        c[g] = !0;
                        try {
                            var k = bc(h, b, c);
                            k.vtp_gtmEventId = b.id;
                            d = $b(k, b);
                            Yb && (d = Yb.nf(d, k))
                        } catch (w) {
                            b.Nd && b.Nd(w, Number(g)), d = !1
                        }
                        c[g] = !1;
                        return d;
                    case "map":
                        d = {};
                        for (var l = 1; l < a.length; l += 2) d[ac(a[l], b, c)] = ac(a[l + 1], b, c);
                        return d;
                    case "template":
                        d = [];
                        for (var m = !1, n = 1; n < a.length; n++) {
                            var q = ac(a[n], b, c);
                            Xb && (m = m || q === Xb.qb);
                            d.push(q)
                        }
                        return Xb && m ? Xb.rf(d) : d.join("");
                    case "escape":
                        d = ac(a[1], b, c);
                        if (Xb && ka(a[1]) && "macro" === a[1][0] && Xb.Tf(a)) return Xb.cg(d);
                        d = String(d);
                        for (var t = 2; t < a.length; t++) ub[a[t]] && (d = ub[a[t]](d));
                        return d;
                    case "tag":
                        var p = a[1];
                        if (!Sb[p]) throw Error("Unable to resolve tag reference " + p + ".");
                        return d = {zd: a[2], index: p};
                    case "zb":
                        var r =
                            {arg0: a[2], arg1: a[3], ignore_case: a[5]};
                        r["function"] = a[1];
                        var v = dc(r, b, c);
                        a[4] && (v = !v);
                        return v;
                    default:
                        throw Error("Attempting to expand unknown Value type: " + a[0] + ".");
                }
            }
            return a
        }, dc = function (a, b, c) {
            try {
                return Wb(bc(a, b, c))
            } catch (d) {
                JSON.stringify(a)
            }
            return null
        };
    var ec = function () {
        var a = function (b) {
            return {
                toString: function () {
                    return b
                }
            }
        };
        return {
            Xc: a("convert_case_to"),
            Yc: a("convert_false_to"),
            Zc: a("convert_null_to"),
            $c: a("convert_true_to"),
            ad: a("convert_undefined_to"),
            fa: a("function"),
            De: a("instance_name"),
            Ee: a("live_only"),
            Fe: a("malware_disabled"),
            Ge: a("metadata"),
            Mg: a("original_vendor_template_id"),
            He: a("once_per_event"),
            pd: a("once_per_load"),
            qd: a("setup_tags"),
            rd: a("tag_id"),
            sd: a("teardown_tags")
        }
    }();
    var fc = null, ic = function (a) {
        function b(q) {
            for (var t = 0; t < q.length; t++) d[q[t]] = !0
        }

        var c = [], d = [];
        fc = gc(a);
        for (var e = 0; e < Qb.length; e++) {
            var g = Qb[e], h = hc(g);
            if (h) {
                for (var k = g.add || [], l = 0; l < k.length; l++) c[k[l]] = !0;
                b(g.block || [])
            } else null === h && b(g.block || [])
        }
        for (var m = [], n = 0; n < Sb.length; n++) c[n] && !d[n] && (m[n] = !0);
        return m
    }, hc = function (a) {
        for (var b = a["if"] || [], c = 0; c < b.length; c++) {
            var d = fc(b[c]);
            if (!d) return null === d ? null : !1
        }
        for (var e = a.unless || [], g = 0; g < e.length; g++) {
            var h = fc(e[g]);
            if (null === h) return null;
            if (h) return !1
        }
        return !0
    }, gc = function (a) {
        var b = [];
        return function (c) {
            void 0 === b[c] && (b[c] = dc(Rb[c], a));
            return b[c]
        }
    };/*
 Copyright (c) 2014 Derek Brans, MIT license https://github.com/krux/postscribe/blob/master/LICENSE. Portions derived from simplehtmlparser, which is licensed under the Apache License, Version 2.0 */
    var yc = {}, zc = null, Ac = Math.random();
    yc.i = "UA-121844058-1";
    yc.ub = "6k2";
    var Bc = {
        __cl: !0,
        __ecl: !0,
        __ehl: !0,
        __evl: !0,
        __fal: !0,
        __fsl: !0,
        __hl: !0,
        __jel: !0,
        __lcl: !0,
        __sdl: !0,
        __tl: !0,
        __ytl: !0
    }, Cc = "www.googletagmanager.com/gtm.js";
    Cc = "www.googletagmanager.com/gtag/js";
    var Dc = Cc, Ec = null, Fc = null, Gc = null, Hc = "//www.googletagmanager.com/a?id=" + yc.i + "&cv=1", Ic = {},
        Jc = {}, Kc = function () {
            var a = zc.sequence || 0;
            zc.sequence = a + 1;
            return a
        };
    var D = function (a, b, c, d) {
        return (2 === Lc() || d || "http:" != f.location.protocol ? a : b) + c
    }, Lc = function () {
        var a = Na(), b;
        if (1 === a) a:{
            var c = Dc;
            c = c.toLowerCase();
            for (var d = "https://" + c, e = "http://" + c, g = 1, h = u.getElementsByTagName("script"), k = 0; k < h.length && 100 > k; k++) {
                var l = h[k].src;
                if (l) {
                    l = l.toLowerCase();
                    if (0 === l.indexOf(e)) {
                        b = 3;
                        break a
                    }
                    1 === g && 0 === l.indexOf(d) && (g = 2)
                }
            }
            b = g
        } else b = a;
        return b
    };
    var Mc = !1;
    var Nc = function (a, b, c, d) {
        if (c) {
            d = d || {};
            var e = f._googWcmImpl || function () {
                e.q = e.q || [];
                e.q.push(arguments)
            };
            f._googWcmImpl = e;
            void 0 === f._googWcmAk && (f._googWcmAk = a);
            Mc ? d.za && A(d.za) : (Ma(D("https://", "http://", "www.gstatic.com/wcm/loader.js"), d.za, d.Qd), Mc = !0);
            var g = {ak: a, cl: b};
            void 0 === d.ce && (g.autoreplace = c);
            e(2, d.ce, g, c, 0, new Date, d.Hg)
        }
    };
    var Qc = function () {
        return "&tc=" + Sb.filter(function (a) {
            return a
        }).length
    }, Zc = function () {
        Rc && (f.clearTimeout(Rc), Rc = void 0);
        void 0 === Sc || Tc[Sc] && !Uc || (Vc[Sc] || Wc.Vf() || 0 >= Xc-- ? (ab("GTM", 1), Vc[Sc] = !0) : (Wc.ng(), Pa(Yc()), Tc[Sc] = !0, Uc = ""))
    }, Yc = function () {
        var a = Sc;
        if (void 0 === a) return "";
        var b = bb("GTM"), c = bb("TAGGING");
        return [$c, Tc[a] ? "" : "&es=1", ad[a], b ? "&u=" + b : "", c ? "&ut=" + c : "", Qc(), Uc, "&z=0"].join("")
    }, bd = function () {
        return [Hc, "&v=3&t=t", "&pid=" + na(), "&rv=" + yc.ub].join("")
    }, cd = "0.005000" >
        Math.random(), $c = bd(), dd = function () {
        $c = bd()
    }, Tc = {}, Uc = "", Sc = void 0, ad = {}, Vc = {}, Rc = void 0, Wc = function (a, b) {
        var c = 0, d = 0;
        return {
            Vf: function () {
                if (c < a) return !1;
                wa() - d >= b && (c = 0);
                return c >= a
            }, ng: function () {
                wa() - d >= b && (c = 0);
                c++;
                d = wa()
            }
        }
    }(2, 1E3), Xc = 1E3, ed = function (a, b) {
        if (cd && !Vc[a] && Sc !== a) {
            Zc();
            Sc = a;
            Uc = "";
            var c;
            c = 0 === b.indexOf("gtm.") ? encodeURIComponent(b) : "*";
            ad[a] = "&e=" + c + "&eid=" + a;
            Rc || (Rc = f.setTimeout(Zc, 500))
        }
    }, fd = function (a, b, c) {
        if (cd && !Vc[a] && b) {
            a !== Sc && (Zc(), Sc = a);
            var d = String(b[ec.fa] || "").replace(/_/g,
                "");
            0 === d.indexOf("cvt") && (d = "cvt");
            var e = c + d;
            Uc = Uc ? Uc + "." + e : "&tr=" + e;
            Rc || (Rc = f.setTimeout(Zc, 500));
            2022 <= Yc().length && Zc()
        }
    };
    var gd = {}, hd = new oa, id = {}, jd = {}, nd = {
        name: "dataLayer", set: function (a, b) {
            Ha(kd(a, b), id);
            ld()
        }, get: function (a) {
            return md(a, 2)
        }, reset: function () {
            hd = new oa;
            id = {};
            ld()
        }
    }, md = function (a, b) {
        if (2 != b) {
            var c = hd.get(a);
            if (cd) {
                var d = od(a);
                c !== d && ab("GTM", 5)
            }
            return c
        }
        return od(a)
    }, od = function (a, b, c) {
        var d = a.split("."), e = !1, g = void 0;
        var h = function (k, l) {
            for (var m = 0; void 0 !== k && m < d.length; m++) {
                if (null === k) return !1;
                k = k[d[m]]
            }
            return void 0 !== k || 1 < m ? k : l.length ? h(pd(l.pop()), l) : qd(d)
        };
        e = !0;
        g = h(id.eventModel, [b, c]);
        return e ? g : qd(d)
    }, qd = function (a) {
        for (var b = id, c = 0; c < a.length; c++) {
            if (null === b) return !1;
            if (void 0 === b) break;
            b = b[a[c]]
        }
        return b
    };
    var rd = function (a, b) {
        return od(a, b, void 0)
    }, pd = function (a) {
        if (a) {
            var b = qd(["gtag", "targets", a]);
            return Ga(b) ? b : void 0
        }
    }, sd = function (a, b) {
        function c(g) {
            g && ra(g, function (h) {
                d[h] = null
            })
        }

        var d = {};
        c(id);
        delete d.eventModel;
        c(pd(a));
        c(pd(b));
        c(id.eventModel);
        var e = [];
        ra(d, function (g) {
            e.push(g)
        });
        return e
    };
    var td = function (a, b) {
        jd.hasOwnProperty(a) || (hd.set(a, b), Ha(kd(a, b), id), ld())
    }, kd = function (a, b) {
        for (var c = {}, d = c, e = a.split("."), g = 0; g < e.length - 1; g++) d = d[e[g]] = {};
        d[e[e.length - 1]] = b;
        return c
    }, ld = function (a) {
        ra(jd, function (b, c) {
            hd.set(b, c);
            Ha(kd(b, void 0), id);
            Ha(kd(b, c), id);
            a && delete jd[b]
        })
    }, ud = function (a, b, c) {
        gd[a] = gd[a] || {};
        var d = 1 !== c ? od(b) : hd.get(b);
        "array" === Ea(d) || "object" === Ea(d) ? gd[a][b] = Ha(d) : gd[a][b] = d
    }, vd = function (a, b) {
        if (gd[a]) return gd[a][b]
    };
    var wd = new RegExp(/^(.*\.)?(google|youtube|blogger|withgoogle)(\.com?)?(\.[a-z]{2})?\.?$/), xd = {
        cl: ["ecl"],
        customPixels: ["nonGooglePixels"],
        ecl: ["cl"],
        ehl: ["hl"],
        hl: ["ehl"],
        html: ["customScripts", "customPixels", "nonGooglePixels", "nonGoogleScripts", "nonGoogleIframes"],
        customScripts: ["html", "customPixels", "nonGooglePixels", "nonGoogleScripts", "nonGoogleIframes"],
        nonGooglePixels: [],
        nonGoogleScripts: ["nonGooglePixels"],
        nonGoogleIframes: ["nonGooglePixels"]
    }, yd = {
        cl: ["ecl"],
        customPixels: ["customScripts", "html"],
        ecl: ["cl"],
        ehl: ["hl"],
        hl: ["ehl"],
        html: ["customScripts"],
        customScripts: ["html"],
        nonGooglePixels: ["customPixels", "customScripts", "html", "nonGoogleScripts", "nonGoogleIframes"],
        nonGoogleScripts: ["customScripts", "html"],
        nonGoogleIframes: ["customScripts", "html", "nonGoogleScripts"]
    }, zd = "google customPixels customScripts html nonGooglePixels nonGoogleScripts nonGoogleIframes".split(" ");
    var Bd = function (a) {
        var b = md("gtm.whitelist");
        b && ab("GTM", 9);
        b = "google gtagfl lcl zone oid op".split(" ");
        var c = b && Ca(ua(b), xd), d = md("gtm.blacklist");
        d || (d = md("tagTypeBlacklist")) && ab("GTM", 3);
        d ? ab("GTM", 8) : d = [];
        Ad() && (d = ua(d), d.push("nonGooglePixels", "nonGoogleScripts"));
        0 <= la(ua(d), "google") && ab("GTM", 2);
        var e = d && Ca(ua(d), yd), g = {};
        return function (h) {
            var k = h && h[ec.fa];
            if (!k || "string" != typeof k) return !0;
            k = k.replace(/^_*/, "");
            if (void 0 !== g[k]) return g[k];
            var l = Jc[k] || [], m = a(k);
            if (b) {
                var n;
                if (n = m) a:{
                    if (0 > la(c, k)) if (l && 0 < l.length) for (var q = 0; q < l.length; q++) {
                        if (0 >
                            la(c, l[q])) {
                            ab("GTM", 11);
                            n = !1;
                            break a
                        }
                    } else {
                        n = !1;
                        break a
                    }
                    n = !0
                }
                m = n
            }
            var t = !1;
            if (d) {
                var p = 0 <= la(e, k);
                if (p) t = p; else {
                    var r = pa(e, l || []);
                    r && ab("GTM", 10);
                    t = r
                }
            }
            var v = !m || t;
            v || !(0 <= la(l, "sandboxedScripts")) || c && -1 !== la(c, "sandboxedScripts") || (v = pa(e, zd));
            return g[k] = v
        }
    }, Ad = function () {
        return wd.test(f.location && f.location.hostname)
    };
    var Cd = {
        nf: function (a, b) {
            b[ec.Xc] && "string" === typeof a && (a = 1 == b[ec.Xc] ? a.toLowerCase() : a.toUpperCase());
            b.hasOwnProperty(ec.Zc) && null === a && (a = b[ec.Zc]);
            b.hasOwnProperty(ec.ad) && void 0 === a && (a = b[ec.ad]);
            b.hasOwnProperty(ec.$c) && !0 === a && (a = b[ec.$c]);
            b.hasOwnProperty(ec.Yc) && !1 === a && (a = b[ec.Yc]);
            return a
        }
    };
    var Dd = {
        active: !0, isWhitelisted: function () {
            return !0
        }
    }, Ed = function (a) {
        var b = zc.zones;
        !b && a && (b = zc.zones = a());
        return b
    };
    var Fd = !1, Gd = 0, Hd = [];

    function Id(a) {
        if (!Fd) {
            var b = u.createEventObject, c = "complete" == u.readyState, d = "interactive" == u.readyState;
            if (!a || "readystatechange" != a.type || c || !b && d) {
                Fd = !0;
                for (var e = 0; e < Hd.length; e++) A(Hd[e])
            }
            Hd.push = function () {
                for (var g = 0; g < arguments.length; g++) A(arguments[g]);
                return 0
            }
        }
    }

    function Jd() {
        if (!Fd && 140 > Gd) {
            Gd++;
            try {
                u.documentElement.doScroll("left"), Id()
            } catch (a) {
                f.setTimeout(Jd, 50)
            }
        }
    }

    var Kd = function (a) {
        Fd ? a() : Hd.push(a)
    };
    var Ld = {}, Md = {}, Nd = function (a, b, c, d) {
        if (!Md[a] || Bc[b] || "__zone" === b) return -1;
        var e = {};
        Ga(d) && (e = Ha(d, e));
        e.id = c;
        e.status = "timeout";
        return Md[a].tags.push(e) - 1
    }, Od = function (a, b, c, d) {
        if (Md[a]) {
            var e = Md[a].tags[b];
            e && (e.status = c, e.executionTime = d)
        }
    };

    function Pd(a) {
        for (var b = Ld[a] || [], c = 0; c < b.length; c++) b[c]();
        Ld[a] = {
            push: function (d) {
                d(yc.i, Md[a])
            }
        }
    }

    var Sd = function (a, b, c) {
        Md[a] = {tags: []};
        ha(b) && Qd(a, b);
        c && f.setTimeout(function () {
            return Pd(a)
        }, Number(c));
        return Rd(a)
    }, Qd = function (a, b) {
        Ld[a] = Ld[a] || [];
        Ld[a].push(ya(function () {
            return A(function () {
                b(yc.i, Md[a])
            })
        }))
    };

    function Rd(a) {
        var b = 0, c = 0, d = !1;
        return {
            add: function () {
                c++;
                return ya(function () {
                    b++;
                    d && b >= c && Pd(a)
                })
            }, Ve: function () {
                d = !0;
                b >= c && Pd(a)
            }
        }
    };var Td = function () {
        function a(d) {
            return !ja(d) || 0 > d ? 0 : d
        }

        if (!zc._li && f.performance && f.performance.timing) {
            var b = f.performance.timing.navigationStart, c = ja(nd.get("gtm.start")) ? nd.get("gtm.start") : 0;
            zc._li = {cst: a(c - b), cbt: a(Fc - b)}
        }
    };
    var Xd = !1, Yd = function () {
        return f.GoogleAnalyticsObject && f[f.GoogleAnalyticsObject]
    }, Zd = !1;
    var $d = function (a) {
        f.GoogleAnalyticsObject || (f.GoogleAnalyticsObject = a || "ga");
        var b = f.GoogleAnalyticsObject;
        if (f[b]) f.hasOwnProperty(b) || ab("GTM", 12); else {
            var c = function () {
                c.q = c.q || [];
                c.q.push(arguments)
            };
            c.l = Number(new Date);
            f[b] = c
        }
        Td();
        return f[b]
    }, ae = function (a, b, c, d) {
        b = String(b).replace(/\s+/g, "").split(",");
        var e = Yd();
        e(a + "require", "linker");
        e(a + "linker:autoLink", b, c, d)
    };
    var ce = function () {
    }, be = function () {
        return f.GoogleAnalyticsObject || "ga"
    }, de = !1;
    var ee = function (a, b, c) {
        if (b) {
            c = c || {};
            var d = f._gaPhoneImpl || function () {
                d.q = d.q || [];
                d.q.push(arguments)
            };
            f._gaPhoneImpl = d;
            void 0 === f.ga_wpid && (f.ga_wpid = a);
            de ? c.za && A(c.za) : (Ma(D("https://", "http://", "www.gstatic.com/gaphone/loader.js"), c.za, c.Qd), de = !0);
            var e = {};
            void 0 !== c.Cd ? e.receiver = c.Cd : e.replace = b;
            e.ga_wpid = a;
            e.destination = b;
            d(2, new Date, e)
        }
    };
    var ke = function (a) {
    };

    function je(a, b) {
        a.containerId = yc.i;
        var c = {type: "GENERIC", value: a};
        b.length && (c.trace = b);
        return c
    };

    function le(a, b, c, d) {
        var e = Sb[a], g = me(a, b, c, d);
        if (!g) return null;
        var h = ac(e[ec.qd], c, []);
        if (h && h.length) {
            var k = h[0];
            g = le(k.index, {K: g, P: 1 === k.zd ? b.terminate : g, terminate: b.terminate}, c, d)
        }
        return g
    }

    function me(a, b, c, d) {
        function e() {
            if (g[ec.Fe]) k(); else {
                var w = bc(g, c, []), y = Nd(c.id, String(g[ec.fa]), Number(g[ec.rd]), w[ec.Ge]), x = !1;
                w.vtp_gtmOnSuccess = function () {
                    if (!x) {
                        x = !0;
                        var C = wa() - B;
                        fd(c.id, Sb[a], "5");
                        Od(c.id, y, "success", C);
                        h()
                    }
                };
                w.vtp_gtmOnFailure = function () {
                    if (!x) {
                        x = !0;
                        var C = wa() - B;
                        fd(c.id, Sb[a], "6");
                        Od(c.id, y, "failure", C);
                        k()
                    }
                };
                w.vtp_gtmTagId = g.tag_id;
                w.vtp_gtmEventId = c.id;
                fd(c.id, g, "1");
                var z = function (C) {
                    var E = wa() - B;
                    ke(C);
                    fd(c.id, g, "7");
                    Od(c.id, y, "exception", E);
                    x || (x = !0, k())
                };
                var B = wa();
                try {
                    $b(w, c)
                } catch (C) {
                    z(C)
                }
            }
        }

        var g = Sb[a], h = b.K, k = b.P, l = b.terminate;
        if (c.vc(g)) return null;
        var m = ac(g[ec.sd], c, []);
        if (m && m.length) {
            var n = m[0], q = le(n.index, {K: h, P: k, terminate: l}, c, d);
            if (!q) return null;
            h = q;
            k = 2 === n.zd ? l : q
        }
        if (g[ec.pd] || g[ec.He]) {
            var t = g[ec.pd] ? Ub : c.yg, p = h, r = k;
            if (!t[a]) {
                e = ya(e);
                var v = ne(a, t, e);
                h = v.K;
                k = v.P
            }
            return function () {
                t[a](p, r)
            }
        }
        return e
    }

    function ne(a, b, c) {
        var d = [], e = [];
        b[a] = oe(d, e, c);
        return {
            K: function () {
                b[a] = pe;
                for (var g = 0; g < d.length; g++) d[g]()
            }, P: function () {
                b[a] = qe;
                for (var g = 0; g < e.length; g++) e[g]()
            }
        }
    }

    function oe(a, b, c) {
        return function (d, e) {
            a.push(d);
            b.push(e);
            c()
        }
    }

    function pe(a) {
        a()
    }

    function qe(a, b) {
        b()
    };var te = function (a, b) {
        for (var c = [], d = 0; d < Sb.length; d++) if (a.Sa[d]) {
            var e = Sb[d];
            var g = b.add();
            try {
                var h = le(d, {K: g, P: g, terminate: g}, a, d);
                h ? c.push({ae: d, b: cc(e), zf: h}) : (re(d, a), g())
            } catch (l) {
                g()
            }
        }
        b.Ve();
        c.sort(se);
        for (var k = 0; k < c.length; k++) c[k].zf();
        return 0 < c.length
    };

    function se(a, b) {
        var c, d = b.b, e = a.b;
        c = d > e ? 1 : d < e ? -1 : 0;
        var g;
        if (0 !== c) g = c; else {
            var h = a.ae, k = b.ae;
            g = h > k ? 1 : h < k ? -1 : 0
        }
        return g
    }

    function re(a, b) {
        if (!cd) return;
        var c = function (d) {
            var e = b.vc(Sb[d]) ? "3" : "4", g = ac(Sb[d][ec.qd], b, []);
            g && g.length && c(g[0].index);
            fd(b.id, Sb[d], e);
            var h = ac(Sb[d][ec.sd], b, []);
            h && h.length && c(h[0].index)
        };
        c(a);
    }

    var ue = !1, ve = function (a, b, c, d, e) {
        if ("gtm.js" == b) {
            if (ue) return !1;
            ue = !0
        }
        ed(a, b);
        var g = Sd(a, d, e);
        ud(a, "event", 1);
        ud(a, "ecommerce", 1);
        ud(a, "gtm");
        var h = {
            id: a, name: b, vc: Bd(c), Sa: [], yg: [], Nd: function (n) {
                ab("GTM", 6);
                ke(n)
            }
        };
        h.Sa = ic(h);
        var k = te(h, g);
        "gtm.js" !== b && "gtm.sync" !== b || ce();
        if (!k) return k;
        for (var l = 0; l < h.Sa.length; l++) if (h.Sa[l]) {
            var m =
                Sb[l];
            if (m && !Bc[String(m[ec.fa])]) return !0
        }
        return !1
    };
    var we = function (a, b) {
        var c = Zb(a, b);
        Sb.push(c);
        return Sb.length - 1
    };
    var G = {Rb: "event_callback", Tb: "event_timeout"};
    G.ca = "gtag.config", G.Ob = "page_view", G.de = "user_engagement", G.T = "allow_ad_personalization_signals", G.ee = "allow_custom_scripts", G.fe = "allow_display_features", G.he = "allow_enhanced_conversions", G.cb = "client_id", G.O = "cookie_domain", G.V = "cookie_expires", G.eb = "cookie_name", G.oa = "cookie_path", G.je = "cookie_update", G.qa = "currency", G.fb = "custom_params", G.me = "custom_map", G.Vb = "groups", G.Ha = "language", G.ke = "country", G.Lg = "non_interaction", G.lb = "page_location", G.mb = "page_referrer", G.ld = "page_title", G.Ja = "send_page_view",
        G.ra = "send_to", G.nb = "session_duration", G.$b = "session_engaged", G.ob = "session_id", G.ac = "session_number", G.Be = "tracking_id", G.pb = "user_properties", G.Ia = "linker", G.ib = "accept_incoming", G.I = "domains", G.kb = "url_position", G.jb = "decorate_forms", G.Zb = "phone_conversion_number", G.Xb = "phone_conversion_callback", G.Yb = "phone_conversion_css_class", G.md = "phone_conversion_options", G.bd = "aw_remarketing", G.cd = "aw_remarketing_only", G.da = "value", G.ze = "quantity", G.pe = "affiliation", G.ue = "tax", G.te = "shipping", G.Qb = "list_name",
        G.kd = "checkout_step", G.jd = "checkout_option", G.qe = "coupon", G.se = "promotions", G.Ka = "transaction_id", G.W = "user_id", G.Ga = "conversion_linker", G.Fa = "conversion_cookie_prefix", G.H = "cookie_prefix", G.U = "items", G.Pb = "aw_merchant_id", G.ed = "aw_feed_country", G.fd = "aw_feed_language", G.dd = "discount", G.hd = "disable_merchant_reported_purchases", G.Wb = "new_customer", G.gd = "customer_lifetime_value", G.oe = "dc_natural_search", G.ne = "dc_custom_params", G.Ce = "trip_type", G.ye = "passengers", G.we = "method", G.Ae = "search_term", G.ie =
        "content_type", G.xe = "optimize_id", G.ve = "experiments", G.hb = "google_signals", G.Ub = "google_tld", G.gb = "ga_restrict_domain", G.Sb = "event_settings", G.nd = [G.T, G.O, G.V, G.eb, G.oa, G.H, G.fb, G.Rb, G.Sb, G.Tb, G.gb, G.hb, G.Ub, G.Vb, G.ra, G.Ja, G.nb, G.W, G.pb], G.Wc = [G.ra, G.bd, G.cd, G.fb, G.Ja, G.Ha, G.da, G.qa, G.Ka, G.W, G.Ga, G.Fa, G.H, G.lb, G.mb, G.Zb, G.Xb, G.Yb, G.md, G.U, G.Pb, G.ed, G.fd, G.dd, G.hd, G.Wb, G.gd, G.T];
    var xe = {};
    var ye = /[A-Z]+/, ze = /\s/, Ae = function (a) {
        if (ia(a) && (a = va(a), !ze.test(a))) {
            var b = a.indexOf("-");
            if (!(0 > b)) {
                var c = a.substring(0, b);
                if (ye.test(c)) {
                    for (var d = a.substring(b + 1).split("/"), e = 0; e < d.length; e++) if (!d[e]) return;
                    return {id: a, prefix: c, containerId: c + "-" + d[0], ia: d}
                }
            }
        }
    }, Ce = function (a) {
        for (var b = {}, c = 0; c < a.length; ++c) {
            var d = Ae(a[c]);
            d && (b[d.id] = d)
        }
        Be(b);
        var e = [];
        ra(b, function (g, h) {
            e.push(h)
        });
        return e
    };

    function Be(a) {
        var b = [], c;
        for (c in a) if (a.hasOwnProperty(c)) {
            var d = a[c];
            "AW" === d.prefix && d.ia[1] && b.push(d.containerId)
        }
        for (var e = 0; e < b.length; ++e) delete a[b[e]]
    };var De = null, Ee = {}, Fe = {}, Ge, Ie = function (a, b) {
        var c = {event: a};
        b && (c.eventModel = Ha(b), b[G.Rb] && (c.eventCallback = b[G.Rb]), b[G.Tb] && (c.eventTimeout = b[G.Tb]));
        return c
    };
    var Je = function () {
        De = De || !zc.gtagRegistered;
        zc.gtagRegistered = !0;
        return De
    }, Ke = function (a) {
        if (void 0 === Fe[a.id]) {
            var b;
            switch (a.prefix) {
                case "UA":
                    b = we("gtagua", {trackingId: a.id});
                    break;
                case "AW":
                    b = we("gtagaw", {conversionId: a});
                    break;
                case "DC":
                    b = we("gtagfl", {targetId: a.id});
                    break;
                case "GF":
                    b = we("gtaggf", {conversionId: a});
                    break;
                case "G":
                    b = we("get", {trackingId: a.id, isAutoTag: !0});
                    break;
                case "HA":
                    b = we("gtagha", {conversionId: a});
                    break;
                default:
                    return
            }
            if (!Ge) {
                var c = Zb("v", {name: "send_to", dataLayerVersion: 2});
                Pb.push(c);
                Ge = ["macro", Pb.length - 1]
            }
            var d = {arg0: Ge, arg1: a.id, ignore_case: !1};
            d[ec.fa] = "_lc";
            Rb.push(d);
            var e = {"if": [Rb.length - 1], add: [b]};
            e["if"] && (e.add || e.block) && Qb.push(e);
            Fe[a.id] = b
        }
    }, Le = function (a) {
        ra(Ee, function (b, c) {
            var d = la(c, a);
            0 <= d && c.splice(d, 1)
        })
    }, Me = ya(function () {
    }), Ne = function (a) {
        if (a.containerId !== yc.i && "G" !== a.prefix) {
            var b;
            switch (a.prefix) {
                case "UA":
                    b = 14;
                    break;
                case "AW":
                    b = 15;
                    break;
                case "DC":
                    b = 16;
                    break;
                default:
                    b = 17
            }
            ab("GTM", b)
        }
    };
    var Oe = {
        config: function (a) {
            var b = a[2] || {};
            if (2 > a.length || !ia(a[1]) || !Ga(b)) return;
            var c = Ae(a[1]);
            if (!c) return;
            Je() ? (Ke(c), Ne(c)) : Me();
            Le(c.id);
            var d = c.id, e = b[G.Vb] || "default";
            e = e.toString().split(",");
            for (var g = 0; g < e.length; g++) Ee[e[g]] = Ee[e[g]] || [], Ee[e[g]].push(d);
            delete b[G.Vb];
            td("gtag.targets." + c.id, void 0);
            td("gtag.targets." + c.id, Ha(b));
            var h = {};
            h[G.ra] = c.id;
            return Ie(G.ca, h);
        }, event: function (a) {
            var b = a[1];
            if (ia(b) && !(3 < a.length)) {
                var c;
                if (2 < a.length) {
                    if (!Ga(a[2])) return;
                    c = a[2]
                }
                var d = Ie(b, c);
                var e;
                var g = c, h = md("gtag.fields.send_to", 2);
                ia(h) || (h = G.ra);
                var k = g && g[h];
                void 0 === k && (k = md(h, 2), void 0 === k && (k = "default"));
                if (ia(k) || ka(k)) {
                    for (var l = k.toString().replace(/\s+/g, "").split(","), m = [], n = 0; n < l.length; n++) 0 <= l[n].indexOf("-") ? m.push(l[n]) : m = m.concat(Ee[l[n]] || []);
                    e = Ce(m)
                } else e = void 0;
                var q = e;
                if (!q) return;
                var t = Je();
                t || Me();
                for (var p = [], r = 0; t && r < q.length; r++) {
                    var v = q[r];
                    Ne(v);
                    p.push(v.id);
                    Ke(v)
                }
                d.eventModel =
                    d.eventModel || {};
                0 < q.length ? d.eventModel[G.ra] = p.join() : delete d.eventModel[G.ra];
                return d
            }
        }, js: function (a) {
            if (2 == a.length && a[1].getTime) return {event: "gtm.js", "gtm.start": a[1].getTime()}
        }, policy: function (a) {
            if (3 === a.length) {
                var b = a[1], c = a[2];
                xe[b] || (xe[b] = []);
                xe[b].push(c)
            }
        }, set: function (a) {
            var b;
            2 == a.length && Ga(a[1]) ? b = Ha(a[1]) : 3 == a.length && ia(a[1]) && (b = {}, b[a[1]] = a[2]);
            if (b) return b.eventModel = Ha(b), b.event = "gtag.set", b._clear = !0, b
        }
    }, Pe = {policy: !0};
    var Qe = function () {
        var a = !1;
        return a
    };
    var Se = function (a) {
        return Re ? u.querySelectorAll(a) : null
    }, Te = function (a, b) {
        if (!Re) return null;
        if (Element.prototype.closest) try {
            return a.closest(b)
        } catch (e) {
            return null
        }
        var c = Element.prototype.matches || Element.prototype.webkitMatchesSelector || Element.prototype.mozMatchesSelector || Element.prototype.msMatchesSelector || Element.prototype.oMatchesSelector,
            d = a;
        if (!u.documentElement.contains(d)) return null;
        do {
            try {
                if (c.call(d, b)) return d
            } catch (e) {
                break
            }
            d = d.parentElement || d.parentNode
        } while (null !== d && 1 === d.nodeType);
        return null
    }, Ue = !1;
    if (u.querySelectorAll) try {
        var Ve = u.querySelectorAll(":root");
        Ve && 1 == Ve.length && Ve[0] == u.documentElement && (Ue = !0)
    } catch (a) {
    }
    var Re = Ue;
    var bf = function (a) {
        if (af(a)) return a;
        this.Fg = a
    };
    bf.prototype.Gf = function () {
        return this.Fg
    };
    var af = function (a) {
        return !a || "object" !== Ea(a) || Ga(a) ? !1 : "getUntrustedUpdateValue" in a
    };
    bf.prototype.getUntrustedUpdateValue = bf.prototype.Gf;
    var cf = !1, df = [];

    function ef() {
        if (!cf) {
            cf = !0;
            for (var a = 0; a < df.length; a++) A(df[a])
        }
    }

    var ff = function (a) {
        cf ? A(a) : df.push(a)
    };
    var gf = [], hf = !1, jf = function (a) {
        return f["dataLayer"].push(a)
    }, kf = function (a) {
        var b = zc["dataLayer"], c = b ? b.subscribers : 1, d = 0;
        return function () {
            ++d === c && a()
        }
    }, mf = function (a) {
        var b = a._clear;
        ra(a, function (g, h) {
            "_clear" !== g && (b && td(g, void 0), td(g, h))
        });
        Ec || (Ec = a["gtm.start"]);
        var c = a.event;
        if (!c) return !1;
        var d = a["gtm.uniqueEventId"];
        d || (d = Kc(), a["gtm.uniqueEventId"] = d, td("gtm.uniqueEventId", d));
        Gc = c;
        var e = lf(a);
        Gc = null;
        return e
    };

    function lf(a) {
        var b = a.event, c = a["gtm.uniqueEventId"], d, e = zc.zones;
        d = e ? e.checkState(yc.i, c) : Dd;
        return d.active ? ve(c, b, d.isWhitelisted, a.eventCallback, a.eventTimeout) ? !0 : !1 : !1
    }

    var nf = function () {
        for (var a = !1; !hf && 0 < gf.length;) {
            hf = !0;
            delete id.eventModel;
            ld();
            var b = gf.shift();
            if (null != b) {
                var c = af(b);
                if (c) {
                    var d = b;
                    b = af(d) ? d.getUntrustedUpdateValue() : void 0;
                    for (var e = ["gtm.whitelist", "gtm.blacklist", "tagTypeBlacklist"], g = 0; g < e.length; g++) {
                        var h = e[g], k = md(h, 1);
                        if (ka(k) || Ga(k)) k = Ha(k);
                        jd[h] = k
                    }
                }
                try {
                    if (ha(b)) try {
                        b.call(nd)
                    } catch (v) {
                    } else if (ka(b)) {
                        var l = b;
                        if (ia(l[0])) {
                            var m =
                                l[0].split("."), n = m.pop(), q = l.slice(1), t = md(m.join("."), 2);
                            if (void 0 !== t && null !== t) try {
                                t[n].apply(t, q)
                            } catch (v) {
                            }
                        }
                    } else {
                        var p = b;
                        if (p && ("[object Arguments]" == Object.prototype.toString.call(p) || Object.prototype.hasOwnProperty.call(p, "callee"))) {
                            a:{
                                if (b.length && ia(b[0])) {
                                    var r = Oe[b[0]];
                                    if (r && (!c || !Pe[b[0]])) {
                                        b = r(b);
                                        break a
                                    }
                                }
                                b = void 0
                            }
                            if (!b) {
                                hf = !1;
                                continue
                            }
                        }
                        a = mf(b) || a
                    }
                } finally {
                    c && ld(!0)
                }
            }
            hf = !1
        }
        return !a
    }, of = function () {
        var a = nf();
        try {
            var b = yc.i, c = f["dataLayer"].hide;
            if (c && void 0 !== c[b] && c.end) {
                c[b] = !1;
                var d = !0, e;
                for (e in c) if (c.hasOwnProperty(e) && !0 === c[e]) {
                    d = !1;
                    break
                }
                d && (c.end(), c.end = null)
            }
        } catch (g) {
        }
        return a
    }, pf = function () {
        var a = Ka("dataLayer", []), b = Ka("google_tag_manager", {});
        b = b["dataLayer"] = b["dataLayer"] || {};
        Kd(function () {
            b.gtmDom || (b.gtmDom = !0, a.push({event: "gtm.dom"}))
        });
        ff(function () {
            b.gtmLoad || (b.gtmLoad = !0, a.push({event: "gtm.load"}))
        });
        b.subscribers = (b.subscribers ||
            0) + 1;
        var c = a.push;
        a.push = function () {
            var d;
            if (0 < zc.SANDBOXED_JS_SEMAPHORE) {
                d = [];
                for (var e = 0; e < arguments.length; e++) d[e] = new bf(arguments[e])
            } else d = [].slice.call(arguments, 0);
            var g = c.apply(a, d);
            gf.push.apply(gf, d);
            if (300 < this.length) for (ab("GTM", 4); 300 < this.length;) this.shift();
            var h = "boolean" !== typeof g || g;
            return nf() && h
        };
        gf.push.apply(gf, a.slice(0));
        A(of)
    };
    var qf;
    var Mf = {};
    Mf.qb = new String("undefined");
    var Nf = function (a) {
        this.resolve = function (b) {
            for (var c = [], d = 0; d < a.length; d++) c.push(a[d] === Mf.qb ? b : a[d]);
            return c.join("")
        }
    };
    Nf.prototype.toString = function () {
        return this.resolve("undefined")
    };
    Nf.prototype.valueOf = Nf.prototype.toString;
    Mf.Ie = Nf;
    Mf.cc = {};
    Mf.rf = function (a) {
        return new Nf(a)
    };
    var Of = {};
    Mf.og = function (a, b) {
        var c = Kc();
        Of[c] = [a, b];
        return c
    };
    Mf.xd = function (a) {
        var b = a ? 0 : 1;
        return function (c) {
            var d = Of[c];
            if (d && "function" === typeof d[b]) d[b]();
            Of[c] = void 0
        }
    };
    Mf.Tf = function (a) {
        for (var b = !1, c = !1,
                 d = 2; d < a.length; d++) b = b || 8 === a[d], c = c || 16 === a[d];
        return b && c
    };
    Mf.cg = function (a) {
        if (a === Mf.qb) return a;
        var b = Kc();
        Mf.cc[b] = a;
        return 'google_tag_manager["' + yc.i + '"].macro(' + b + ")"
    };
    Mf.Xf = function (a, b, c) {
        a instanceof Mf.Ie && (a = a.resolve(Mf.og(b, c)), b = fa);
        return {sc: a, K: b}
    };
    var Pf = function (a, b, c) {
        function d(g, h) {
            var k = g[h];
            return k
        }

        var e = {
            event: b,
            "gtm.element": a,
            "gtm.elementClasses": d(a, "className"),
            "gtm.elementId": a["for"] || Ua(a, "id") || "",
            "gtm.elementTarget": a.formTarget || d(a, "target") || ""
        };
        c && (e["gtm.triggers"] = c.join(","));
        e["gtm.elementUrl"] = (a.attributes && a.attributes.formaction ? a.formAction : "") || a.action || d(a, "href") || a.src || a.code || a.codebase ||
            "";
        return e
    }, Qf = function (a) {
        zc.hasOwnProperty("autoEventsSettings") || (zc.autoEventsSettings = {});
        var b = zc.autoEventsSettings;
        b.hasOwnProperty(a) || (b[a] = {});
        return b[a]
    }, Rf = function (a, b, c) {
        Qf(a)[b] = c
    }, Sf = function (a, b, c, d) {
        var e = Qf(a), g = xa(e, b, d);
        e[b] = c(g)
    }, Tf = function (a, b, c) {
        var d = Qf(a);
        return xa(d, b, c)
    };
    var Uf = function () {
        for (var a = Ia.userAgent + (u.cookie || "") + (u.referrer || ""), b = a.length, c = f.history.length; 0 < c;) a += c-- ^ b++;
        var d = 1, e, g, h;
        if (a) for (d = 0, g = a.length - 1; 0 <= g; g--) h = a.charCodeAt(g), d = (d << 6 & 268435455) + h + (h << 14), e = d & 266338304, d = 0 != e ? d ^ e >> 21 : d;
        return [Math.round(2147483647 * Math.random()) ^ d & 2147483647, Math.round(wa() / 1E3)].join(".")
    }, Xf = function (a, b, c, d) {
        var e = Vf(b);
        return mb(a, e, Wf(c), d)
    }, Vf = function (a) {
        if (!a) return 1;
        a = 0 === a.indexOf(".") ? a.substr(1) : a;
        return a.split(".").length
    }, Wf = function (a) {
        if (!a ||
            "/" === a) return 1;
        "/" !== a[0] && (a = "/" + a);
        "/" !== a[a.length - 1] && (a += "/");
        return a.split("/").length - 1
    };

    function Yf(a, b) {
        var c = "" + Vf(a), d = Wf(b);
        1 < d && (c += "-" + d);
        return c
    };var Zf = ["1"], $f = {}, dg = function (a, b, c, d) {
        var e = ag(a);
        $f[e] || bg(e, b, c) || (cg(e, Uf(), b, c, d), bg(e, b, c))
    };

    function cg(a, b, c, d, e) {
        var g;
        g = ["1", Yf(d, c), b].join(".");
        rb(a, g, c, d, 0 == e ? void 0 : new Date(wa() + 1E3 * (void 0 == e ? 7776E3 : e)))
    }

    function bg(a, b, c) {
        var d = Xf(a, b, c, Zf);
        d && ($f[a] = d);
        return d
    }

    function ag(a) {
        return (a || "_gcl") + "_au"
    };var eg = function () {
        for (var a = [], b = u.cookie.split(";"), c = /^\s*_gac_(UA-\d+-\d+)=\s*(.+?)\s*$/, d = 0; d < b.length; d++) {
            var e = b[d].match(c);
            e && a.push({Pc: e[1], value: e[2]})
        }
        var g = {};
        if (!a || !a.length) return g;
        for (var h = 0; h < a.length; h++) {
            var k = a[h].value.split(".");
            "1" == k[0] && 3 == k.length && k[1] && (g[a[h].Pc] || (g[a[h].Pc] = []), g[a[h].Pc].push({
                timestamp: k[1],
                Df: k[2]
            }))
        }
        return g
    };

    function fg() {
        for (var a = gg, b = {}, c = 0; c < a.length; ++c) b[a[c]] = c;
        return b
    }

    function hg() {
        var a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        a += a.toLowerCase() + "0123456789-_";
        return a + "."
    }

    var gg, ig, jg = function (a) {
        gg = gg || hg();
        ig = ig || fg();
        for (var b = [], c = 0; c < a.length; c += 3) {
            var d = c + 1 < a.length, e = c + 2 < a.length, g = a.charCodeAt(c), h = d ? a.charCodeAt(c + 1) : 0,
                k = e ? a.charCodeAt(c + 2) : 0, l = g >> 2, m = (g & 3) << 4 | h >> 4, n = (h & 15) << 2 | k >> 6,
                q = k & 63;
            e || (q = 64, d || (n = 64));
            b.push(gg[l], gg[m], gg[n], gg[q])
        }
        return b.join("")
    }, kg = function (a) {
        function b(l) {
            for (; d < a.length;) {
                var m = a.charAt(d++), n = ig[m];
                if (null != n) return n;
                if (!/^[\s\xa0]*$/.test(m)) throw Error("Unknown base64 encoding at char: " + m);
            }
            return l
        }

        gg = gg || hg();
        ig = ig ||
            fg();
        for (var c = "", d = 0; ;) {
            var e = b(-1), g = b(0), h = b(64), k = b(64);
            if (64 === k && -1 === e) return c;
            c += String.fromCharCode(e << 2 | g >> 4);
            64 != h && (c += String.fromCharCode(g << 4 & 240 | h >> 2), 64 != k && (c += String.fromCharCode(h << 6 & 192 | k)))
        }
    };
    var lg;

    function mg(a, b) {
        if (!a || b === u.location.hostname) return !1;
        for (var c = 0; c < a.length; c++) if (a[c] instanceof RegExp) {
            if (a[c].test(b)) return !0
        } else if (0 <= b.indexOf(a[c])) return !0;
        return !1
    }

    var qg = function () {
        var a = ng, b = og, c = pg(), d = function (h) {
            a(h.target || h.srcElement || {})
        }, e = function (h) {
            b(h.target || h.srcElement || {})
        };
        if (!c.init) {
            Qa(u, "mousedown", d);
            Qa(u, "keyup", d);
            Qa(u, "submit", e);
            var g = HTMLFormElement.prototype.submit;
            HTMLFormElement.prototype.submit = function () {
                b(this);
                g.call(this)
            };
            c.init = !0
        }
    }, pg = function () {
        var a = Ka("google_tag_data", {}), b = a.gl;
        b && b.decorators || (b = {decorators: []}, a.gl = b);
        return b
    };
    var rg = /(.*?)\*(.*?)\*(.*)/, sg = /^https?:\/\/([^\/]*?)\.?cdn\.ampproject\.org\/?(.*)/,
        tg = /^(?:www\.|m\.|amp\.)+/, ug = /([^?#]+)(\?[^#]*)?(#.*)?/, vg = /(.*?)(^|&)_gl=([^&]*)&?(.*)/,
        xg = function (a) {
            var b = [], c;
            for (c in a) if (a.hasOwnProperty(c)) {
                var d = a[c];
                void 0 !== d && d === d && null !== d && "[object Object]" !== d.toString() && (b.push(c), b.push(jg(String(d))))
            }
            var e = b.join("*");
            return ["1", wg(e), e].join("*")
        }, wg = function (a, b) {
            var c = [window.navigator.userAgent, (new Date).getTimezoneOffset(), window.navigator.userLanguage ||
                window.navigator.language, Math.floor((new Date).getTime() / 60 / 1E3) - (void 0 === b ? 0 : b), a].join("*"),
                d;
            if (!(d = lg)) {
                for (var e = Array(256), g = 0; 256 > g; g++) {
                    for (var h = g, k = 0; 8 > k; k++) h = h & 1 ? h >>> 1 ^ 3988292384 : h >>> 1;
                    e[g] = h
                }
                d = e
            }
            lg = d;
            for (var l = 4294967295, m = 0; m < c.length; m++) l = l >>> 8 ^ lg[(l ^ c.charCodeAt(m)) & 255];
            return ((l ^ -1) >>> 0).toString(36)
        }, zg = function () {
            return function (a) {
                var b = ib(f.location.href), c = b.search.replace("?", ""), d = eb(c, "_gl", !0) || "";
                a.query = yg(d) || {};
                var e = hb(b, "fragment").match(vg);
                a.fragment = yg(e && e[3] ||
                    "") || {}
            }
        }, yg = function (a) {
            var b;
            b = void 0 === b ? 3 : b;
            try {
                if (a) {
                    var c;
                    a:{
                        for (var d = a, e = 0; 3 > e; ++e) {
                            var g = rg.exec(d);
                            if (g) {
                                c = g;
                                break a
                            }
                            d = decodeURIComponent(d)
                        }
                        c = void 0
                    }
                    var h = c;
                    if (h && "1" === h[1]) {
                        var k = h[3], l;
                        a:{
                            for (var m = h[2], n = 0; n < b; ++n) if (m === wg(k, n)) {
                                l = !0;
                                break a
                            }
                            l = !1
                        }
                        if (l) {
                            for (var q = {}, t = k ? k.split("*") : [], p = 0; p < t.length; p += 2) q[t[p]] = kg(t[p + 1]);
                            return q
                        }
                    }
                }
            } catch (r) {
            }
        };

    function Ag(a, b, c) {
        function d(m) {
            var n = m, q = vg.exec(n), t = n;
            if (q) {
                var p = q[2], r = q[4];
                t = q[1];
                r && (t = t + p + r)
            }
            m = t;
            var v = m.charAt(m.length - 1);
            m && "&" !== v && (m += "&");
            return m + l
        }

        c = void 0 === c ? !1 : c;
        var e = ug.exec(b);
        if (!e) return "";
        var g = e[1], h = e[2] || "", k = e[3] || "", l = "_gl=" + a;
        c ? k = "#" + d(k.substring(1)) : h = "?" + d(h.substring(1));
        return "" + g + h + k
    }

    function Bg(a, b, c) {
        for (var d = {}, e = {}, g = pg().decorators, h = 0; h < g.length; ++h) {
            var k = g[h];
            (!c || k.forms) && mg(k.domains, b) && (k.fragment ? za(e, k.callback()) : za(d, k.callback()))
        }
        if (Aa(d)) {
            var l = xg(d);
            if (c) {
                if (a && a.action) {
                    var m = (a.method || "").toLowerCase();
                    if ("get" === m) {
                        for (var n = a.childNodes || [], q = !1, t = 0; t < n.length; t++) {
                            var p = n[t];
                            if ("_gl" === p.name) {
                                p.setAttribute("value", l);
                                q = !0;
                                break
                            }
                        }
                        if (!q) {
                            var r = u.createElement("input");
                            r.setAttribute("type", "hidden");
                            r.setAttribute("name", "_gl");
                            r.setAttribute("value",
                                l);
                            a.appendChild(r)
                        }
                    } else if ("post" === m) {
                        var v = Ag(l, a.action);
                        Za.test(v) && (a.action = v)
                    }
                }
            } else Cg(l, a, !1)
        }
        if (!c && Aa(e)) {
            var w = xg(e);
            Cg(w, a, !0)
        }
    }

    function Cg(a, b, c) {
        if (b.href) {
            var d = Ag(a, b.href, void 0 === c ? !1 : c);
            Za.test(d) && (b.href = d)
        }
    }

    var ng = function (a) {
        try {
            var b;
            a:{
                for (var c = a, d = 100; c && 0 < d;) {
                    if (c.href && c.nodeName.match(/^a(?:rea)?$/i)) {
                        b = c;
                        break a
                    }
                    c = c.parentNode;
                    d--
                }
                b = null
            }
            var e = b;
            if (e) {
                var g = e.protocol;
                "http:" !== g && "https:" !== g || Bg(e, e.hostname, !1)
            }
        } catch (h) {
        }
    }, og = function (a) {
        try {
            if (a.action) {
                var b = hb(ib(a.action), "host");
                Bg(a, b, !0)
            }
        } catch (c) {
        }
    }, Dg = function (a, b, c, d) {
        qg();
        var e = {callback: a, domains: b, fragment: "fragment" === c, forms: !!d};
        pg().decorators.push(e)
    }, Eg = function () {
        var a = u.location.hostname, b = sg.exec(u.referrer);
        if (!b) return !1;
        var c = b[2], d = b[1], e = "";
        if (c) {
            var g = c.split("/"), h = g[1];
            e = "s" === h ? decodeURIComponent(g[2]) : decodeURIComponent(h)
        } else if (d) {
            if (0 === d.indexOf("xn--")) return !1;
            e = d.replace(/-/g, ".").replace(/\.\./g, "-")
        }
        return a.replace(tg, "") === e.replace(tg, "")
    }, Fg = function (a, b) {
        return !1 === a ? !1 : a || b || Eg()
    };
    var Gg = {};
    var Hg = /^\w+$/, Ig = /^[\w-]+$/, Jg = /^~?[\w-]+$/, Kg = {aw: "_aw", dc: "_dc", gf: "_gf", ha: "_ha"};

    function Lg(a) {
        return a && "string" == typeof a && a.match(Hg) ? a : "_gcl"
    }

    var Ng = function () {
        var a = ib(f.location.href), b = hb(a, "query", !1, void 0, "gclid"), c = hb(a, "query", !1, void 0, "gclsrc"),
            d = hb(a, "query", !1, void 0, "dclid");
        if (!b || !c) {
            var e = a.hash.replace("#", "");
            b = b || eb(e, "gclid", void 0);
            c = c || eb(e, "gclsrc", void 0)
        }
        return Mg(b, c, d)
    };

    function Mg(a, b, c) {
        var d = {}, e = function (g, h) {
            d[h] || (d[h] = []);
            d[h].push(g)
        };
        if (void 0 !== a && a.match(Ig)) switch (b) {
            case void 0:
                e(a, "aw");
                break;
            case "aw.ds":
                e(a, "aw");
                e(a, "dc");
                break;
            case "ds":
                e(a, "dc");
                break;
            case "3p.ds":
                (void 0 == Gg.gtm_3pds ? 0 : Gg.gtm_3pds) && e(a, "dc");
                break;
            case "gf":
                e(a, "gf");
                break;
            case "ha":
                e(a, "ha")
        }
        c && e(c, "dc");
        return d
    }

    function Og(a, b, c) {
        function d(q, t) {
            var p = Pg(q, e);
            p && rb(p, t, h, g, l, !0)
        }

        b = b || {};
        var e = Lg(b.prefix), g = b.domain || "auto", h = b.path || "/", k = void 0 == b.Od ? 7776E3 : b.Od;
        c = c || wa();
        var l = 0 == k ? void 0 : new Date(c + 1E3 * k), m = Math.round(c / 1E3), n = function (q) {
            return ["GCL", m, q].join(".")
        };
        a.aw && (!0 === b.lh ? d("aw", n("~" + a.aw[0])) : d("aw", n(a.aw[0])));
        a.dc && d("dc", n(a.dc[0]));
        a.gf && d("gf", n(a.gf[0]));
        a.ha && d("ha", n(a.ha[0]))
    }

    var Pg = function (a, b) {
        var c = Kg[a];
        if (void 0 !== c) return b + c
    }, Qg = function (a) {
        var b = a.split(".");
        return 3 !== b.length || "GCL" !== b[0] ? 0 : 1E3 * (Number(b[1]) || 0)
    };

    function Rg(a) {
        var b = a.split(".");
        if (3 == b.length && "GCL" == b[0] && b[1]) return b[2]
    }

    var Sg = function (a, b, c, d, e) {
        if (ka(b)) {
            var g = Lg(e);
            Dg(function () {
                for (var h = {}, k = 0; k < a.length; ++k) {
                    var l = Pg(a[k], g);
                    if (l) {
                        var m = jb(l, u.cookie);
                        m.length && (h[l] = m.sort()[m.length - 1])
                    }
                }
                return h
            }, b, c, d)
        }
    }, Tg = function (a) {
        return a.filter(function (b) {
            return Jg.test(b)
        })
    }, Ug = function (a) {
        for (var b = ["aw", "dc"], c = Lg(a && a.prefix), d = {}, e = 0; e < b.length; e++) Kg[b[e]] && (d[b[e]] = Kg[b[e]]);
        ra(d, function (g, h) {
            var k = jb(c + h, u.cookie);
            if (k.length) {
                var l = k[0], m = Qg(l), n = {};
                n[g] = [Rg(l)];
                Og(n, a, m)
            }
        })
    };
    var Wg = /^\d+\.fls\.doubleclick\.net$/;

    function Xg(a) {
        var b = ib(f.location.href), c = hb(b, "host", !1);
        if (c && c.match(Wg)) {
            var d = hb(b, "path").split(a + "=");
            if (1 < d.length) return d[1].split(";")[0].split("?")[0]
        }
    }

    function Yg(a, b) {
        if ("aw" == a || "dc" == a) {
            var c = Xg("gcl" + a);
            if (c) return c.split(".")
        }
        var d = Lg(b);
        if ("_gcl" == d) {
            var e;
            e = Ng()[a] || [];
            if (0 < e.length) return e
        }
        var g = Pg(a, d), h;
        if (g) {
            var k = [];
            if (u.cookie) {
                var l = jb(g, u.cookie);
                if (l && 0 != l.length) {
                    for (var m = 0; m < l.length; m++) {
                        var n = Rg(l[m]);
                        n && -1 === la(k, n) && k.push(n)
                    }
                    h = Tg(k)
                } else h = k
            } else h = k
        } else h = [];
        return h
    }

    var Zg = function () {
        var a = Xg("gac");
        if (a) return decodeURIComponent(a);
        var b = eg(), c = [];
        ra(b, function (d, e) {
            for (var g = [], h = 0; h < e.length; h++) g.push(e[h].Df);
            g = Tg(g);
            g.length && c.push(d + ":" + g.join(","))
        });
        return c.join(";")
    }, $g = function (a, b, c, d, e) {
        dg(b, c, d, e);
        var g = $f[ag(b)], h = Ng().dc || [], k = !1;
        if (g && 0 < h.length) {
            var l = zc.joined_au = zc.joined_au || {}, m = b || "_gcl";
            if (!l[m]) for (var n = 0; n < h.length; n++) {
                var q = "http://ad.doubleclick.net/ddm/regclk", t = q = q + "?gclid=" + h[n] + "&auiddc=" + g;
                Ia.sendBeacon && Ia.sendBeacon(t) || Pa(t);
                k = l[m] =
                    !0
            }
        }
        null == a && (a = k);
        if (a && g) {
            var p = ag(b), r = $f[p];
            r && cg(p, r, c, d, e)
        }
    };
    var ah;
    if (3 === yc.ub.length) ah = "g"; else {
        var bh = "G";
        bh = "g";
        ah = bh
    }
    var ch = {"": "n", UA: "u", AW: "a", DC: "d", G: "e", GF: "f", HA: "h", GTM: ah, OPT: "o"}, dh = function (a) {
        var b = yc.i.split("-"), c = b[0].toUpperCase(), d = ch[c] || "i",
            e = a && "GTM" === c ? b[1] : "OPT" === c ? b[1] : "", g;
        if (3 === yc.ub.length) {
            var h = void 0;
            h = h || (Qe() ? "s" : "o");
            g = "2" + (h || "w")
        } else g =
            "";
        return g + d + yc.ub + e
    };
    var eh = function (a) {
        return !(void 0 === a || null === a || 0 === (a + "").length)
    }, fh = function (a, b) {
        var c;
        if (2 === b.N) return a("ord", na(1E11, 1E13)), !0;
        if (3 === b.N) return a("ord", "1"), a("num", na(1E11, 1E13)), !0;
        if (4 === b.N) return eh(b.sessionId) && a("ord", b.sessionId), !0;
        if (5 === b.N) c = "1"; else if (6 === b.N) c = b.Kc; else return !1;
        eh(c) && a("qty", c);
        eh(b.xb) && a("cost", b.xb);
        eh(b.transactionId) && a("ord", b.transactionId);
        return !0
    }, gh = encodeURIComponent, hh = function (a, b) {
        function c(n, q, t) {
            g.hasOwnProperty(n) || (q += "", e += ";" + n + "=" +
                (t ? q : gh(q)))
        }

        var d = a.nc, e = a.protocol;
        e += a.Hb ? "//" + d + ".fls.doubleclick.net/activityi" : "//ad.doubleclick.net/activity";
        e += ";src=" + gh(d) + (";type=" + gh(a.qc)) + (";cat=" + gh(a.Na));
        var g = a.tf || {};
        ra(g, function (n, q) {
            e += ";" + gh(n) + "=" + gh(q + "")
        });
        if (fh(c, a)) {
            eh(a.Mb) && c("u", a.Mb);
            eh(a.Lb) && c("tran", a.Lb);
            c("gtm", dh());
            !1 === a.Re && c("npa", "1");
            if (a.kc) {
                var h = Yg("dc", a.wa);
                h && h.length && c("gcldc", h.join("."));
                var k = Yg("aw", a.wa);
                k && k.length && c("gclaw", k.join("."));
                var l = Zg();
                l && c("gac", l);
                dg(a.wa, void 0, a.pf, a.qf);
                var m = $f[ag(a.wa)];
                m && c("auiddc", m)
            }
            eh(a.Gc) && c("prd", a.Gc, !0);
            ra(a.Sc, function (n, q) {
                c(n, q)
            });
            e += b || "";
            eh(a.Fb) && c("~oref", a.Fb);
            a.Hb ? Oa(e + "?", a.K) : Pa(e + "?", a.K, a.P)
        } else A(a.P)
    };
    var ih = ["input", "select", "textarea"], jh = ["button", "hidden", "image", "reset", "submit"], kh = function (a) {
        var b = a.tagName.toLowerCase();
        return !ma(ih, function (c) {
            return c === b
        }) || "input" === b && ma(jh, function (c) {
            return c === a.type.toLowerCase()
        }) ? !1 : !0
    };
    var mh = function (a) {
        var b = "/pagead/conversion/" + lh(a.conversion_id) + "/?", c = lh(JSON.stringify(a.conversion_data)),
            d = "https://www.googletraveladservices.com/travel/flights/clk" + b + "conversion_data=" + c;
        if (a.conversionLinkerEnabled) {
            var e = Yg("gf", a.cookiePrefix);
            if (e && e.length) for (var g = 0; g < e.length; g++) d += "&gclgf=" + lh(e[g])
        }
        Pa(d, a.onSuccess, a.onFailure)
    }, lh = function (a) {
        return null === a || void 0 === a || 0 === String(a).length ? "" : encodeURIComponent(String(a))
    };
    var nh = !!f.MutationObserver, oh = void 0, ph = function (a) {
        if (!oh) {
            var b = function () {
                var c = u.body;
                if (c) if (nh) (new MutationObserver(function () {
                    for (var e = 0; e < oh.length; e++) A(oh[e])
                })).observe(c, {childList: !0, subtree: !0}); else {
                    var d = !1;
                    Qa(c, "DOMNodeInserted", function () {
                        d || (d = !0, A(function () {
                            d = !1;
                            for (var e = 0; e < oh.length; e++) A(oh[e])
                        }))
                    })
                }
            };
            oh = [];
            u.body ? b() : A(b)
        }
        oh.push(a)
    };
    var Rh = f.clearTimeout, Sh = f.setTimeout, H = function (a, b, c) {
        if (Qe()) {
            b && A(b)
        } else return Ma(a, b, c)
    }, Th = function () {
        return new Date
    }, Uh = function () {
        return f.location.href
    }, Vh = function (a) {
        return hb(ib(a), "fragment")
    }, Wh = function (a) {
        return gb(ib(a))
    }, Xh = null;
    var Yh = function (a, b) {
            return md(a, b || 2)
        }, Zh = function (a, b, c) {
            b && (a.eventCallback = b, c && (a.eventTimeout = c));
            return jf(a)
        }, $h = function (a, b) {
            f[a] = b
        }, K = function (a, b, c) {
            b && (void 0 === f[a] || c && !f[a]) && (f[a] = b);
            return f[a]
        }, ai = function (a, b, c) {
            return jb(a, b, void 0 === c ? !0 : !!c)
        }, bi = function (a, b, c, d) {
            var e = {prefix: a, path: b, domain: c, Od: d}, g = Ng();
            Og(g, e);
            Ug(e)
        }, ci = function (a, b, c, d, e) {
            var g = zg(), h = pg();
            h.data || (h.data = {query: {}, fragment: {}}, g(h.data));
            var k = {}, l = h.data;
            l &&
            (za(k, l.query), za(k, l.fragment));
            for (var m = Lg(b), n = 0; n < a.length; ++n) {
                var q = a[n];
                if (void 0 !== Kg[q]) {
                    var t = Pg(q, m), p = k[t];
                    if (p) {
                        var r = Math.min(Qg(p), wa()), v;
                        b:{
                            for (var w = r, y = jb(t, u.cookie), x = 0; x < y.length; ++x) if (Qg(y[x]) > w) {
                                v = !0;
                                break b
                            }
                            v = !1
                        }
                        v || rb(t, p, c, d, 0 == e ? void 0 : new Date(r + 1E3 * (null == e ? 7776E3 : e)), !0)
                    }
                }
            }
            var z = {prefix: b, path: c, domain: d};
            Og(Mg(k.gclid, k.gclsrc), z);
        }, di = function (a, b, c, d, e) {
            Sg(a, b, c, d, e);
        },
        ei = function (a, b) {
            if (Qe()) {
                b && A(b)
            } else Oa(a, b)
        }, fi = function (a) {
            return !!Tf(a, "init", !1)
        }, gi = function (a) {
            Rf(a, "init", !0)
        }, hi = function (a, b, c) {
            var d = (void 0 === c ? 0 : c) ? "www.googletagmanager.com/gtag/js" : Dc;
            d += "?id=" + encodeURIComponent(a) + "&l=dataLayer";
            b && ra(b, function (e, g) {
                g && (d += "&" + e + "=" + encodeURIComponent(g))
            });
            H(D("https://", "http://", d))
        }, ii = function (a, b) {
            var c = a[b];
            return c
        };
    var ji = function (a, b, c, d, e, g) {
        var h = {config: a, gtm: dh()};
        c && (dg(d, void 0, e, g), h.auiddc = $f[ag(d)]);
        b && (h.loadInsecure = b);
        K("__dc_ns_processor", []).push(h);
        H((b ? "http" : "https") + "://www.googletagmanager.com/dclk/ns/v1.js")
    };
    var ki = Mf.Xf;
    var li = new oa, mi = function (a, b) {
        function c(h) {
            var k = ib(h), l = hb(k, "protocol"), m = hb(k, "host", !0), n = hb(k, "port"),
                q = hb(k, "path").toLowerCase().replace(/\/$/, "");
            if (void 0 === l || "http" == l && "80" == n || "https" == l && "443" == n) l = "web", n = "default";
            return [l, m, n, q]
        }

        for (var d = c(String(a)), e = c(String(b)), g = 0; g < d.length; g++) if (d[g] !== e[g]) return !1;
        return !0
    }, ni = function (a) {
        var b = a.arg0, c = a.arg1;
        if (a.any_of && ka(c)) {
            for (var d = 0; d < c.length; d++) if (ni({"function": a["function"], arg0: b, arg1: c[d]})) return !0;
            return !1
        }
        switch (a["function"]) {
            case "_cn":
                return 0 <=
                    String(b).indexOf(String(c));
            case "_css":
                var e;
                a:{
                    if (b) {
                        var g = ["matches", "webkitMatchesSelector", "mozMatchesSelector", "msMatchesSelector", "oMatchesSelector"];
                        try {
                            for (var h = 0; h < g.length; h++) if (b[g[h]]) {
                                e = b[g[h]](c);
                                break a
                            }
                        } catch (v) {
                        }
                    }
                    e = !1
                }
                return e;
            case "_ew":
                var k, l;
                k = String(b);
                l = String(c);
                var m = k.length - l.length;
                return 0 <= m && k.indexOf(l, m) == m;
            case "_eq":
                return String(b) == String(c);
            case "_ge":
                return Number(b) >= Number(c);
            case "_gt":
                return Number(b) > Number(c);
            case "_lc":
                var n;
                n = String(b).split(",");
                return 0 <= la(n, String(c));
            case "_le":
                return Number(b) <= Number(c);
            case "_lt":
                return Number(b) < Number(c);
            case "_re":
                var q;
                var t = a.ignore_case ? "i" : void 0;
                try {
                    var p = String(c) + t, r = li.get(p);
                    r || (r = new RegExp(c, t), li.set(p, r));
                    q = r.test(b)
                } catch (v) {
                    q = !1
                }
                return q;
            case "_sw":
                return 0 == String(b).indexOf(String(c));
            case "_um":
                return mi(b, c)
        }
        return !1
    };
    var pi = function (a, b) {
        var c = function () {
        };
        c.prototype = a.prototype;
        var d = new c;
        a.apply(d, Array.prototype.slice.call(arguments, 1));
        return d
    };
    var qi = {}, ri = encodeURI, L = encodeURIComponent, si = Pa;
    var ti = function (a, b) {
        if (!a) return !1;
        var c = hb(ib(a), "host");
        if (!c) return !1;
        for (var d = 0; b && d < b.length; d++) {
            var e = b[d] && b[d].toLowerCase();
            if (e) {
                var g = c.length - e.length;
                0 < g && "." != e.charAt(0) && (g--, e = "." + e);
                if (0 <= g && c.indexOf(e, g) == g) return !0
            }
        }
        return !1
    };
    var ui = function (a, b, c) {
        for (var d = {}, e = !1, g = 0; a && g < a.length; g++) a[g] && a[g].hasOwnProperty(b) && a[g].hasOwnProperty(c) && (d[a[g][b]] = a[g][c], e = !0);
        return e ? d : null
    };
    qi.Uf = function () {
        var a = !1;
        return a
    };
    var vi = function () {
        var a = !1;
        return a
    };
    var Vi = function () {
        var a = f.gaGlobal = f.gaGlobal || {};
        a.hid = a.hid || na();
        return a.hid
    };
    var mj = function (a, b, c, d) {
        this.n = a;
        this.t = b;
        this.p = c;
        this.d = d
    }, nj = function () {
        this.c = 1;
        this.e = [];
        this.p = null
    };

    function oj(a) {
        var b = zc, c = b.gss = b.gss || {};
        return c[a] = c[a] || new nj
    }

    var pj = function (a, b) {
        oj(a).p = b
    }, qj = function (a) {
        var b = oj(a), c = b.p;
        if (c) {
            var d = b.e, e = [];
            b.e = [];
            var g = function (h) {
                for (var k = 0; k < h.length; k++) try {
                    var l = h[k];
                    l.d ? (l.d = !1, e.push(l)) : c(l.n, l.t, l.p)
                } catch (m) {
                }
            };
            g(d);
            g(e)
        }
    };
    var Aj = window, Bj = document, Cj = function (a) {
        var b = Aj._gaUserPrefs;
        if (b && b.ioo && b.ioo() || a && !0 === Aj["ga-disable-" + a]) return !0;
        try {
            var c = Aj.external;
            if (c && c._gaUserPrefs && "oo" == c._gaUserPrefs) return !0
        } catch (g) {
        }
        for (var d = jb("AMP_TOKEN", Bj.cookie, !0), e = 0; e < d.length; e++) if ("$OPT_OUT" == d[e]) return !0;
        return Bj.getElementById("__gaOptOutExtension") ? !0 : !1
    };
    var Jj = function (a, b, c) {
        Ij(a);
        var d = Math.floor(wa() / 1E3);
        oj(a).e.push(new mj(b, d, c, void 0));
        qj(a)
    }, Kj = function (a, b, c) {
        Ij(a);
        var d = Math.floor(wa() / 1E3);
        oj(a).e.push(new mj(b, d, c, !0))
    }, Ij = function (a) {
        if (1 === oj(a).c && (oj(a).c = 2, !Qe())) {
            var b = encodeURIComponent(a);
            Ma(("http:" != f.location.protocol ? "https:" : "http:") + ("//www.googletagmanager.com/gtag/js?id=" + b + "&l=dataLayer&cx=c"))
        }
    }, Mj = function (a, b) {
    }, Lj = function (a,
                      b) {
    };
    var Y = {a: {}};


    Y.a.gtagha = ["google"], function () {
        function a(h) {
            function k(m, n) {
                void 0 !== n && l.push(m + "=" + n)
            }

            if (void 0 === h) return "";
            var l = [];
            k("hct_base_price", h.Fd);
            k("hct_booking_xref", h.Gd);
            k("hct_checkin_date", h.Jf);
            k("hct_checkout_date", h.Kf);
            k("hct_currency_code", h.Lf);
            k("hct_partner_hotel_id", h.Hd);
            k("hct_total_price", h.Id);
            return l.join(";")
        }

        function b(h, k, l, m) {
            var n = L(h), q = L(a(k)),
                t = "https://www.googletraveladservices.com/travel/clk/pagead/conversion/" + n + "/?data=" + q;
            l && (t += Yg("ha", m).map(function (p) {
                return "&gclha=" +
                    L(p)
            }).join(""));
            return t
        }

        function c(h, k, l, m, n, q) {
            /^\d+$/.test(h) ? si(b(h, k, l, m), n, q) : A(q)
        }

        function d(h, k, l, m) {
            var n = {};
            ia(h) ? n.Gd = h : "number" === typeof h && (n.Gd = String(h));
            ia(l) && (n.Lf = l);
            ia(k) ? n.Id = n.Fd = k : "number" === typeof k && (n.Id = n.Fd = String(k));
            if (!ka(m) || 0 == m.length) return n;
            var q = m[0];
            if (!Ga(q)) return n;
            ia(q.id) ? n.Hd = q.id : "number" === typeof q.id && (n.Hd = String(q.id));
            ia(q.start_date) && (n.Jf = q.start_date);
            ia(q.end_date) && (n.Kf = q.end_date);
            return n
        }

        function e(h) {
            var k = Gc, l = h.vtp_gtmOnSuccess, m = h.vtp_gtmOnFailure,
                n = h.vtp_conversionId, q = n.containerId, t = function (z) {
                    return od(z, q, n.id)
                }, p = !1 !== t(G.Ga), r = t(G.Fa) || t(G.H), v = t(G.O), w = t(G.V);
            if (k === G.ca) {
                var y = t(G.Ia) || {};
                p && (Fg(y[G.ib], !!y[G.I]) && ci(g, r, void 0, v, w), bi(r, void 0, v, w));
                y[G.I] && di(g, y[G.I], y[G.kb], !!y[G.jb], r);
                A(l)
            } else if ("purchase" === k) {
                var x = d(t(G.Ka), t(G.da), t(G.qa), t(G.U));
                c(n.ia[0], x, p, r, l, m)
            } else A(m)
        }

        var g = ["ha"];
        Y.__gtagha = e;
        Y.__gtagha.g = "gtagha";
        Y.__gtagha.h = !0;
        Y.__gtagha.b = 0;
    }();

    Y.a.e = ["google"], function () {
        (function (a) {
            Y.__e = a;
            Y.__e.g = "e";
            Y.__e.h = !0;
            Y.__e.b = 0
        })(function (a) {
            return String(vd(a.vtp_gtmEventId, "event"))
        })
    }();
    Y.a.v = ["google"], function () {
        (function (a) {
            Y.__v = a;
            Y.__v.g = "v";
            Y.__v.h = !0;
            Y.__v.b = 0
        })(function (a) {
            var b = a.vtp_name;
            if (!b || !b.replace) return !1;
            var c = Yh(b.replace(/\\\./g, "."), a.vtp_dataLayerVersion || 1);
            return void 0 !== c ? c : a.vtp_defaultValue
        })
    }();


    Y.a.gtagaw = ["google"], function () {
        var a = !1, b = [], c = ["aw", "dc"], d = function (m) {
            var n = K("google_trackConversion"), q = m.gtm_onFailure;
            "function" == typeof n ? n(m) || q() : q()
        }, e = function () {
            for (; 0 < b.length;) d(b.shift())
        }, g = function () {
            a || (a = !0, Td(), H(D("https://", "http://", "www.googleadservices.com/pagead/conversion_async.js"), function () {
                e();
                b = {push: d}
            }, function () {
                e();
                a = !1
            }))
        }, h = function (m, n, q, t) {
            if (Qe()) {
            } else {
                ka(n) || (n = [n]);
                for (var p =
                    0; p < n.length; p++) 1 > p && Nc(m.ia[0], m.ia[1], n[p], {ce: q, Hg: t})
            }
        }, k = function (m) {
            if (m) {
                for (var n = [], q = 0; q < m.length; ++q) {
                    var t = m[q];
                    t && n.push({
                        item_id: t.id,
                        quantity: t.quantity,
                        value: t.price,
                        start_date: t.start_date,
                        end_date: t.end_date
                    })
                }
                return n
            }
        }, l = function (m) {
            var n = m.vtp_conversionId, q = Gc, t = q == G.ca, p = n.ia[0], r = n.ia[1], v = void 0 !== r,
                w = n.containerId, y = v ? n.id : void 0, x = function (X) {
                    return od(X, w, y)
                }, z = !1 !== x(G.Ga), B = x(G.Fa) || x(G.H), C = x(G.O), E = x(G.V);
            if (t) {
                var F = x(G.Ia) || {};
                z && (Fg(F[G.ib], !!F[G.I]) && ci(c, B, void 0,
                    C, E), bi(B, void 0, C, E));
                F[G.I] && di(c, F[G.I], F[G.kb], !!F[G.jb], B);
                if (v) {
                    var P = x(G.Zb), U = x(G.Xb), R = x(G.Yb), T = x(G.md);
                    h(n, P, U || R, T)
                }
            }
            var O = !1 === x(G.bd) || !1 === x(G.Ja);
            if (!t || !v && !O) if (!0 === x(G.cd) && (v = !1), !1 !== x(G.T) || v) {
                var M = {
                    google_conversion_id: p,
                    google_remarketing_only: !v,
                    onload_callback: m.vtp_gtmOnSuccess,
                    gtm_onFailure: m.vtp_gtmOnFailure,
                    google_conversion_format: "3",
                    google_conversion_color: "ffffff",
                    google_conversion_domain: "",
                    google_conversion_label: r,
                    google_conversion_language: x(G.Ha),
                    google_conversion_value: x(G.da),
                    google_conversion_currency: x(G.qa),
                    google_conversion_order_id: x(G.Ka),
                    google_user_id: x(G.W),
                    google_conversion_page_url: x(G.lb),
                    google_conversion_referrer_url: x(G.mb),
                    google_gtm: dh()
                };
                Qe() && (M.opt_image_generator = function () {
                    return new Image
                }, M.google_enable_display_cookie_match = !1);
                !1 === x(G.T) && (M.google_allow_ad_personalization_signals = !1);
                M.google_read_gcl_cookie_opt_out = !z;
                z && B && (M.google_gcl_cookie_prefix = B);
                var I = function () {
                    var X = x(G.fb), W = {event: q};
                    if (ka(X)) {
                        for (var ea = 0; ea < X.length; ++ea) {
                            var V =
                                X[ea], N = x(V);
                            void 0 !== N && (W[V] = N)
                        }
                        return W
                    }
                    var Z = x("eventModel");
                    if (!Z) return null;
                    Ha(Z, W);
                    for (var qa = 0; qa < G.Wc.length; ++qa) delete W[G.Wc[qa]];
                    return W
                }();
                I && (M.google_custom_params = I);
                !v && x(G.U) && (M.google_gtag_event_data = {items: x(G.U), value: x(G.da)});
                if (v && "purchase" == q) {
                    x(G.Pb) && (M.google_conversion_merchant_id = x(G.Pb), M.google_basket_feed_country = x(G.ed), M.google_basket_feed_language = x(G.fd), M.google_basket_discount = x(G.dd), M.google_basket_transaction_type = q, M.google_disable_merchant_reported_conversions =
                        !0 === x(G.hd), Qe() && (M.google_disable_merchant_reported_conversions = !0));
                    var J = k(x(G.U));
                    J && (M.google_conversion_items = J)
                }
                var Q = function (X, W) {
                    void 0 != W && "" !== W && (M.google_additional_conversion_params = M.google_additional_conversion_params || {}, M.google_additional_conversion_params[X] = W)
                };
                v && ("boolean" == typeof x(G.Wb) && Q("vdnc", x(G.Wb)), Q("vdltv", x(G.gd)));
                var S = !0;
                S && b.push(M)
            }
            g()
        };
        Y.__gtagaw = l;
        Y.__gtagaw.g = "gtagaw";
        Y.__gtagaw.h = !0;
        Y.__gtagaw.b = 0
    }();

    Y.a.get = ["google"], function () {
        function a(b, c) {
            ra(c, function (e) {
                "_" === e.charAt(0) && delete c[e]
            });
            var d = c[G.pb] || {};
            ra(d, function (e) {
                "_" === e.charAt(0) && delete d[e]
            })
        }

        (function (b) {
            Y.__get = b;
            Y.__get.g = "get";
            Y.__get.h = !0;
            Y.__get.b = 0
        })(function (b) {
            if (b.vtp_isAutoTag) {
                for (var c = String(b.vtp_trackingId), d = Gc || "", e = {}, g = G.nd, h = 0; h < g.length; h++) {
                    var k = rd(g[h], c);
                    void 0 !== k && (e[g[h]] = k)
                }
                var l = rd(G.fb, c);
                if (ka(l)) for (var m = 0; m < l.length; m++) {
                    var n = l[m], q = rd(n, c);
                    void 0 !== q && (e[n] = q)
                } else {
                    var t = Yh("eventModel");
                    Ha(t, e)
                }
                if ("_" === d.charAt(0)) return;
                a(d, e);
                Jj(c, d, Ha(e))
            } else {
                var p = b.vtp_settings, r = p.eventParameters, v = p.userProperties;
                Ha(ui(b.vtp_eventParameters, "name", "value"), r);
                Ha(ui(b.vtp_userProperties, "name", "value"), v);
                r[G.pb] = v;
                var w = String(b.vtp_eventName), y = b.vtp_allowSystemNames;
                if (!y && "_" === w.charAt(0)) return;
                y || a(w, r);
                (b.vtp_deferrable ? Kj : Jj)(String(p.streamId), w, r)
            }
            b.vtp_gtmOnSuccess()
        })
    }();


    Y.a.gtagfl = [], function () {
        function a(e) {
            var g = /^DC-(\d+)(\/([\w-]+)\/([\w-]+)\+(\w+))?$/.exec(e);
            if (g) {
                var h = {
                    standard: 2,
                    unique: 3,
                    per_session: 4,
                    transactions: 5,
                    items_sold: 6,
                    "": 1
                }[(g[5] || "").toLowerCase()];
                if (h) return {
                    containerId: "DC-" + g[1],
                    be: g[3] ? e : "",
                    Le: g[1],
                    Ke: g[3] || "",
                    Na: g[4] || "",
                    N: h
                }
            }
        }

        function b(e, g) {
            function h(t, p, r) {
                void 0 !== r && 0 !== (r + "").length && k.push(t + p + ":" + e(r + ""))
            }

            var k = [], l = g(G.U) || [];
            if (ka(l)) for (var m = 0; m < l.length; m++) {
                var n = l[m], q = m + 1;
                h("i", q, n.id);
                h("p", q, n.price);
                h("q", q, n.quantity);
                h("c", q, g(G.ke));
                h("l", q, g(G.Ha))
            }
            return k.join("|")
        }

        function c(e, g, h) {
            var k = /^u([1-9]\d?|100)$/, l = e(G.me) || {}, m = sd(g, h), n = {}, q = {};
            if (Ga(l)) for (var t in l) if (l.hasOwnProperty(t) && k.test(t)) {
                var p = l[t];
                ia(p) && (n[t] = p)
            }
            for (var r = 0; r < m.length; r++) {
                var v = m[r];
                k.test(v) && (n[v] = v)
            }
            for (var w in n) n.hasOwnProperty(w) && (q[w] = e(n[w]));
            return q
        }

        var d = ["aw", "dc"];
        (function (e) {
            Y.__gtagfl = e;
            Y.__gtagfl.g = "gtagfl";
            Y.__gtagfl.h = !0;
            Y.__gtagfl.b = 0
        })(function (e) {
            var g = e.vtp_gtmOnSuccess, h = e.vtp_gtmOnFailure, k = a(e.vtp_targetId);
            if (k) {
                var l = function (R) {
                    return od(R, k.containerId, k.be || void 0)
                }, m = !1 !== l(G.Ga), n = l(G.Fa) || l(G.H), q = l(G.O), t = l(G.V), p = l(G.oe), r = 3 === Lc();
                if (Gc === G.ca) {
                    var v = l(G.Ia) || {}, w = l(G.je), y = void 0 === w ? !0 : !!w;
                    m && (Fg(v[G.ib], !!v[G.I]) && ci(d, n, void 0, q, t), bi(n, void 0, q, t), $g(y, n, void 0, q, t));
                    v[G.I] && di(d, v[G.I], v[G.kb], !!v[G.jb], n);
                    p && p.exclusion_parameters && p.engines && ji(p, r, m, n, q, t);
                    A(g)
                } else {
                    var x = {}, z = l(G.ne);
                    if (Ga(z)) for (var B in z) if (z.hasOwnProperty(B)) {
                        var C = z[B];
                        void 0 !== C && null !== C && (x[B] = C)
                    }
                    var E =
                        "";
                    if (5 === k.N || 6 === k.N) E = b(L, l);
                    var F = c(l, k.containerId, k.be), P = !0 === l(G.ee);
                    if (Qe() && P) {
                        P = !1
                    }
                    var U = {
                        Na: k.Na,
                        kc: m,
                        pf: q,
                        qf: t,
                        wa: n,
                        xb: l(G.da),
                        N: k.N,
                        tf: x,
                        nc: k.Le,
                        qc: k.Ke,
                        P: h,
                        K: g,
                        Fb: Wh(Uh()),
                        Gc: E,
                        protocol: r ? "http:" : "https:",
                        Kc: l(G.ze),
                        Hb: P,
                        sessionId: l(G.ob),
                        Lb: void 0,
                        transactionId: l(G.Ka),
                        Mb: void 0,
                        Sc: F,
                        Re: !1 !== l(G.T)
                    };
                    hh(U)
                }
            } else A(h)
        })
    }();

    Y.a.gtaggf = ["google"], function () {
        var a = /.*\.google\.com(:\d+)?\/booking\/flights.*/, b = function (c) {
            if (c) {
                for (var d = [], e = 0, g = 0; g < c.length; ++g) {
                    var h = c[g];
                    !h || void 0 !== h.category && "" !== h.category && "FlightSegment" !== h.category || (d[e] = {
                        cabin: h.travel_class,
                        fare_product: h.fare_product,
                        booking_code: h.booking_code,
                        flight_number: h.flight_number,
                        origin: h.origin,
                        destination: h.destination,
                        departure_date: h.start_date
                    }, e++)
                }
                return d
            }
        };
        (function (c) {
            Y.__gtaggf = c;
            Y.__gtaggf.g = "gtaggf";
            Y.__gtaggf.h = !0;
            Y.__gtaggf.b =
                0
        })(function (c) {
            var d = Gc, e = c.vtp_gtmOnSuccess, g = c.vtp_gtmOnFailure, h = c.vtp_conversionId, k = h.ia[0],
                l = h.containerId, m = function (x) {
                    return od(x, l, h.id)
                }, n = !1 !== m(G.Ga), q = m(G.Fa) || m(G.H), t = m(G.O), p = m(G.V);
            if (d === G.ca) n && bi(q, void 0, t, p), A(e); else {
                var r = {conversion_id: k, onFailure: g, onSuccess: e, conversionLinkerEnabled: n, cookiePrefix: q};
                if ("purchase" === d) {
                    var v = a.test(Uh()), w = {
                        partner_id: k,
                        trip_type: m(G.Ce),
                        total_price: m(G.da),
                        currency: m(G.qa),
                        is_direct_booking: v,
                        flight_segment: b(m(G.U))
                    }, y = m(G.ye);
                    y && "object" ===
                    typeof y && (w.passengers_total = y.total, w.passengers_adult = y.adult, w.passengers_child = y.child, w.passengers_infant_in_seat = y.infant_in_seat, w.passengers_infant_in_lap = y.infant_in_lap);
                    r.conversion_data = w
                }
                mh(r)
            }
        })
    }();


    Y.a.gtagua = ["google"], function () {
        var a, b = {
                client_id: 1,
                client_storage: "storage",
                cookie_name: 1,
                cookie_domain: 1,
                cookie_expires: 1,
                cookie_path: 1,
                cookie_update: 1,
                sample_rate: 1,
                site_speed_sample_rate: 1,
                use_amp_client_id: 1,
                store_gac: 1,
                conversion_linker: "storeGac"
            }, c = {
                anonymize_ip: 1,
                app_id: 1,
                app_installer_id: 1,
                app_name: 1,
                app_version: 1,
                campaign: {
                    name: "campaignName",
                    source: "campaignSource",
                    medium: "campaignMedium",
                    term: "campaignTerm",
                    content: "campaignContent",
                    id: "campaignId"
                },
                currency: "currencyCode",
                description: "exDescription",
                fatal: "exFatal",
                language: 1,
                non_interaction: 1,
                page_hostname: "hostname",
                page_referrer: "referrer",
                page_path: "page",
                page_location: "location",
                page_title: "title",
                screen_name: 1,
                transport_type: "transport",
                user_id: 1
            }, d = {
                content_id: 1,
                event_category: 1,
                event_action: 1,
                event_label: 1,
                link_attribution: 1,
                linker: 1,
                method: 1,
                name: 1,
                send_page_view: 1,
                value: 1
            }, e = {cookie_name: 1, cookie_expires: "duration", levels: 1}, g = {
                anonymize_ip: 1,
                fatal: 1,
                non_interaction: 1,
                use_amp_client_id: 1,
                send_page_view: 1,
                store_gac: 1,
                conversion_linker: 1
            },
            h = function (r, v, w, y) {
                if (void 0 !== w) if (g[v] && (w = ta(w)), "anonymize_ip" != v || w || (w = void 0), 1 === r) y[k(v)] = w; else if (ia(r)) y[r] = w; else for (var x in r) r.hasOwnProperty(x) && void 0 !== w[x] && (y[r[x]] = w[x])
            }, k = function (r) {
                return r && ia(r) ? r.replace(/(_[a-z])/g, function (v) {
                    return v[1].toUpperCase()
                }) : r
            }, l = function (r, v, w) {
                r.hasOwnProperty(v) || (r[v] = w)
            }, m = function (r, v, w) {
                var y = {}, x = {}, z = {}, B;
                var C = rd(G.ve, r);
                if (ka(C)) {
                    for (var E = [], F = 0; F < C.length; F++) {
                        var P = C[F];
                        if (void 0 != P) {
                            var U = P.id, R = P.variant;
                            void 0 != U && void 0 !=
                            R && E.push(String(U) + "." + String(R))
                        }
                    }
                    B = 0 < E.length ? E.join("!") : void 0
                } else B = void 0;
                var T = B;
                T && l(x, "exp", T);
                var O = rd("custom_map", r);
                if (Ga(O)) for (var M in O) if (O.hasOwnProperty(M) && /^(dimension|metric)\d+$/.test(M) && void 0 != O[M]) {
                    var I = rd(String(O[M]), r);
                    void 0 !== I && l(x, M, I)
                }
                for (var J = sd(r), Q = 0; Q < J.length; ++Q) {
                    var S = J[Q], X = rd(S, r);
                    d.hasOwnProperty(S) ? h(d[S], S, X, y) : c.hasOwnProperty(S) ? h(c[S], S, X, x) : b.hasOwnProperty(S) ? h(b[S], S, X, z) : /^(dimension|metric|content_group)\d+$/.test(S) ? h(1, S, X, x) : S === G.H &&
                        0 > la(J, G.eb) && (z.cookieName = X + "_ga")
                }
                var W = String(Gc);
                l(z, "cookieDomain", "auto");
                l(x, "forceSSL", !0);
                var ea = "general";
                0 <= la("add_payment_info add_to_cart add_to_wishlist begin_checkout checkout_progress purchase refund remove_from_cart set_checkout_option".split(" "), W) ? ea = "ecommerce" : 0 <= la("generate_lead login search select_content share sign_up view_item view_item_list view_promotion view_search_results".split(" "), W) ? ea = "engagement" : "exception" == W && (ea = "error");
                l(y, "eventCategory", ea);
                0 <= la(["view_item",
                    "view_item_list", "view_promotion", "view_search_results"], W) && l(x, "nonInteraction", !0);
                "login" == W || "sign_up" == W || "share" == W ? l(y, "eventLabel", rd(G.we, r)) : "search" == W || "view_search_results" == W ? l(y, "eventLabel", rd(G.Ae, r)) : "select_content" == W && l(y, "eventLabel", rd(G.ie, r));
                var V = y[G.Ia] || {}, N = V[G.ib];
                N || 0 != N && V[G.I] ? z.allowLinker = !0 : !1 === N && l(z, "useAmpClientId", !1);
                if (!1 === rd(G.fe, r) || !1 === rd(G.T, r)) x.allowAdFeatures = !1;
                z.name = v;
                x["&gtm"] = dh(!0);
                x.hitCallback = w;
                y.Z = x;
                y.mc = z;
                return y
            }, n = function (r) {
                function v(I) {
                    var J =
                        Ha(I);
                    J.list = I.list_name;
                    J.listPosition = I.list_position;
                    J.position = I.list_position || I.creative_slot;
                    J.creative = I.creative_name;
                    return J
                }

                function w(I) {
                    for (var J = [], Q = 0; I && Q < I.length; Q++) I[Q] && J.push(v(I[Q]));
                    return J.length ? J : void 0
                }

                function y(I) {
                    return {
                        id: z(x.Ka),
                        affiliation: z(x.pe),
                        revenue: z(x.da),
                        tax: z(x.ue),
                        shipping: z(x.te),
                        coupon: z(x.qe),
                        list: z(x.Qb) || I
                    }
                }

                for (var x = G, z = function (I) {
                    return od(I, r, void 0)
                }, B = z(x.U), C, E = 0; B && E < B.length && !(C = B[E][x.Qb]); E++) ;
                var F = z("custom_map");
                if (Ga(F)) for (var P =
                    0; B && P < B.length; ++P) {
                    var U = B[P], R;
                    for (R in F) F.hasOwnProperty(R) && /^(dimension|metric)\d+$/.test(R) && void 0 != F[R] && l(U, R, U[F[R]])
                }
                var T = null, O = Gc, M = z(x.se);
                "purchase" == O || "refund" == O ? T = {
                    action: O,
                    Ma: y(),
                    Ba: w(B)
                } : "add_to_cart" == O ? T = {action: "add", Ba: w(B)} : "remove_from_cart" == O ? T = {
                    action: "remove",
                    Ba: w(B)
                } : "view_item" == O ? T = {
                    action: "detail",
                    Ma: y(C),
                    Ba: w(B)
                } : "view_item_list" == O ? T = {
                    action: "impressions",
                    Of: w(B)
                } : "view_promotion" == O ? T = {
                    action: "promo_view",
                    Hc: w(M)
                } : "select_content" == O && M && 0 < M.length ? T = {
                    action: "promo_click",
                    Hc: w(M)
                } : "select_content" == O ? T = {
                    action: "click",
                    Ma: {list: z(x.Qb) || C},
                    Ba: w(B)
                } : "begin_checkout" == O || "checkout_progress" == O ? T = {
                    action: "checkout",
                    Ba: w(B),
                    Ma: {step: "begin_checkout" == O ? 1 : z(x.kd), option: z(x.jd)}
                } : "set_checkout_option" == O && (T = {action: "checkout_option", Ma: {step: z(x.kd), option: z(x.jd)}});
                T && (T.Sg = z(x.qa));
                return T
            }, q = {}, t = function (r, v) {
                var w = q[r];
                q[r] = Ha(v);
                if (!w) return !1;
                for (var y in v) if (v.hasOwnProperty(y) && v[y] !== w[y]) return !0;
                for (var x in w) if (w.hasOwnProperty(x) && w[x] !== v[x]) return !0;
                return !1
            }, p = function (r) {
                var v = r.vtp_trackingId, w = "https://www.google-analytics.com/analytics.js", y = $d();
                if (ha(y)) {
                    var x = "gtag_" + v.split("-").join("_"), z = function (O) {
                        var M = [].slice.call(arguments, 0);
                        M[0] = x + "." + M[0];
                        y.apply(window, M)
                    }, B = function () {
                        var O = function (Q, S) {
                            for (var X = 0; S && X < S.length; X++) z(Q, S[X])
                        }, M = n(v);
                        if (M) {
                            var I = M.action;
                            if ("impressions" == I) O("ec:addImpression", M.Of); else if ("promo_click" == I || "promo_view" == I) {
                                var J = M.Hc;
                                O("ec:addPromo", M.Hc);
                                J && 0 < J.length && "promo_click" == I && z("ec:setAction",
                                    I)
                            } else O("ec:addProduct", M.Ba), z("ec:setAction", I, M.Ma)
                        }
                    }, C = function () {
                        if (Qe()) {
                        } else {
                            var O = rd(G.xe, v);
                            O && (z("require", O, {dataLayer: "dataLayer"}), z("require", "render"))
                        }
                    }, E = function () {
                        if (Qe()) {
                        } else {
                            var O = rd(G.Zb, v), M = rd(G.Yb, v), I = rd(G.Xb, v), J;
                            J = ka(O) ? O : [O];
                            for (var Q = 0; Q < J.length; Q++) 5 >
                            Q && ee(v, J[Q], {Cd: I || M});
                        }
                    }, F = m(v, x, r.vtp_gtmOnSuccess);
                    (function () {
                    })();
                    t(x, F.mc) && y(function () {
                        Yd() && Yd().remove(x)
                    });
                    y("create", v, F.mc);
                    (function () {
                        var O = rd("custom_map", v);
                        y(function () {
                            if (Ga(O)) {
                                var M = F.Z, I = Yd().getByName(x), J;
                                for (J in O) if (O.hasOwnProperty(J) && /^(dimension|metric)\d+$/.test(J) && void 0 != O[J]) {
                                    var Q = I.get(k(O[J]));
                                    l(M, J, Q)
                                }
                            }
                        })
                    })();
                    (function (O) {
                        if (O) {
                            var M = {};
                            if (Ga(O)) for (var I in e) e.hasOwnProperty(I) && h(e[I], I, O[I], M);
                            z("require", "linkid", M)
                        }
                    })(F.linkAttribution);
                    var P = F[G.Ia];
                    if (P && P[G.I]) {
                        var U = P[G.kb];
                        ae(x + ".", P[G.I], void 0 === U ? !!P.use_anchor : "fragment" === U, !!P[G.jb])
                    }
                    var R = function (O, M, I) {
                        I && (M = "" + M);
                        F.Z[O] = M
                    }, T = Gc;
                    T == G.Ob ? (C(), z("send", "pageview", F.Z)) : T == G.ca ? (C(), E(), 0 != F.sendPageView && z("send", "pageview", F.Z)) : "screen_view" == T ? z("send", "screenview", F.Z) : "timing_complete" == T ? (R("timingCategory", F.eventCategory,
                        !0), R("timingVar", F.name, !0), R("timingValue", sa(F.value)), void 0 !== F.eventLabel && R("timingLabel", F.eventLabel, !0), z("send", "timing", F.Z)) : "exception" == T ? z("send", "exception", F.Z) : "optimize.callback" != T && (0 <= la("view_item_list select_content view_item add_to_cart remove_from_cart begin_checkout set_checkout_option purchase refund view_promotion checkout_progress".split(" "), T) && (z("require", "ec", "ec.js"), B()), R("eventCategory", F.eventCategory, !0), R("eventAction", F.eventAction || T, !0), void 0 !== F.eventLabel &&
                    R("eventLabel", F.eventLabel, !0), void 0 !== F.value && R("eventValue", sa(F.value)), z("send", "event", F.Z));
                    a || (a = !0, Td(), H(w, function () {
                        Yd().loaded || r.vtp_gtmOnFailure()
                    }, r.vtp_gtmOnFailure))
                } else A(r.vtp_gtmOnFailure)
            };
        Y.__gtagua = p;
        Y.__gtagua.g = "gtagua";
        Y.__gtagua.h = !0;
        Y.__gtagua.b = 0
    }();

    var Nj = {};
    Nj.macro = function (a) {
        if (Mf.cc.hasOwnProperty(a)) return Mf.cc[a]
    }, Nj.onHtmlSuccess = Mf.xd(!0), Nj.onHtmlFailure = Mf.xd(!1);
    Nj.dataLayer = nd;
    Nj.callback = function (a) {
        Ic.hasOwnProperty(a) && ha(Ic[a]) && Ic[a]();
        delete Ic[a]
    };
    Nj.$e = function () {
        zc[yc.i] = Nj;
        za(Jc, Y.a);
        Xb = Xb || Mf;
        Yb = Cd
    };
    Nj.Pf = function () {
        Gg.gtm_3pds = !0;
        zc = f.google_tag_manager = f.google_tag_manager || {};
        if (zc[yc.i]) {
            var a = zc.zones;
            a && a.unregisterChild(yc.i)
        } else {
            for (var b = data.resource || {}, c = b.macros || [], d = 0; d < c.length; d++) Pb.push(c[d]);
            for (var e = b.tags || [], g = 0; g < e.length; g++) Sb.push(e[g]);
            for (var h = b.predicates || [],
                     k = 0; k < h.length; k++) Rb.push(h[k]);
            for (var l = b.rules || [], m = 0; m < l.length; m++) {
                for (var n = l[m], q = {}, t = 0; t < n.length; t++) q[n[t][0]] = Array.prototype.slice.call(n[t], 1);
                Qb.push(q)
            }
            Vb = Y;
            Wb = ni;
            Nj.$e();
            pf();
            Fd = !1;
            Gd = 0;
            if ("interactive" == u.readyState && !u.createEventObject || "complete" == u.readyState) Id(); else {
                Qa(u, "DOMContentLoaded", Id);
                Qa(u, "readystatechange", Id);
                if (u.createEventObject && u.documentElement.doScroll) {
                    var p = !0;
                    try {
                        p = !f.frameElement
                    } catch (y) {
                    }
                    p && Jd()
                }
                Qa(f, "load", Id)
            }
            cf = !1;
            "complete" === u.readyState ? ef() :
                Qa(f, "load", ef);
            a:{
                if (!cd) break a;
                f.setInterval(dd, 864E5);
            }
            Fc = (new Date).getTime();
        }
    };
    (0, Nj.Pf)();

})()
