package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.`Search-zoom-out`: ImageVector
    get() {
        if (`_search-zoom-out` != null) {
            return `_search-zoom-out`!!
        }
        `_search-zoom-out` = Builder(name = "Search-zoom-out", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.3005f, 21.9986f)
                curveTo(21.1205f, 21.9986f, 20.9405f, 21.9286f, 20.8105f, 21.7986f)
                lineTo(18.9505f, 19.9386f)
                curveTo(18.6805f, 19.6686f, 18.6805f, 19.2286f, 18.9505f, 18.9486f)
                curveTo(19.2205f, 18.6786f, 19.6605f, 18.6786f, 19.9405f, 18.9486f)
                lineTo(21.8005f, 20.8086f)
                curveTo(22.0705f, 21.0786f, 22.0705f, 21.5186f, 21.8005f, 21.7986f)
                curveTo(21.6605f, 21.9286f, 21.4805f, 21.9986f, 21.3005f, 21.9986f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 2.0f)
                curveTo(6.26f, 2.0f, 2.0f, 6.26f, 2.0f, 11.5f)
                curveTo(2.0f, 16.74f, 6.26f, 21.0f, 11.5f, 21.0f)
                curveTo(16.74f, 21.0f, 21.0f, 16.74f, 21.0f, 11.5f)
                curveTo(21.0f, 6.26f, 16.74f, 2.0f, 11.5f, 2.0f)
                close()
                moveTo(14.0f, 12.45f)
                horizontalLineTo(9.0f)
                curveTo(8.59f, 12.45f, 8.25f, 12.11f, 8.25f, 11.7f)
                curveTo(8.25f, 11.29f, 8.59f, 10.95f, 9.0f, 10.95f)
                horizontalLineTo(14.0f)
                curveTo(14.41f, 10.95f, 14.75f, 11.29f, 14.75f, 11.7f)
                curveTo(14.75f, 12.11f, 14.41f, 12.45f, 14.0f, 12.45f)
                close()
            }
        }
        .build()
        return `_search-zoom-out`!!
    }

private var `_search-zoom-out`: ImageVector? = null
