package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.`Google-play`: ImageVector
    get() {
        if (`_google-play` != null) {
            return `_google-play`!!
        }
        `_google-play` = Builder(name = "Google-play", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.3992f, 12.9498f)
                lineTo(16.8892f, 15.2098f)
                lineTo(13.6992f, 12.0198f)
                lineTo(16.9192f, 8.7998f)
                lineTo(21.3992f, 11.0498f)
                curveTo(22.1892f, 11.4398f, 22.1892f, 12.5598f, 21.3992f, 12.9498f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9193f, 8.8001f)
                lineTo(13.6993f, 12.0201f)
                lineTo(4.0293f, 2.3501f)
                lineTo(16.9193f, 8.8001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.7f, 12.0202f)
                lineTo(4.12f, 21.6003f)
                lineTo(3.55f, 21.8902f)
                curveTo(2.83f, 22.2402f, 2.0f, 21.7302f, 2.0f, 20.9302f)
                verticalLineTo(3.0703f)
                curveTo(2.0f, 2.2703f, 2.83f, 1.7602f, 3.55f, 2.1102f)
                lineTo(4.03f, 2.3503f)
                lineTo(13.7f, 12.0202f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8891f, 15.21f)
                lineTo(4.1191f, 21.6f)
                lineTo(13.6991f, 12.02f)
                lineTo(16.8891f, 15.21f)
                close()
            }
        }
        .build()
        return `_google-play`!!
    }

private var `_google-play`: ImageVector? = null
