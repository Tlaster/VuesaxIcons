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

public val BulkGroup.Link1: ImageVector
    get() {
        if (_link1 != null) {
            return _link1!!
        }
        _link1 = Builder(name = "Link1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.9999f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(10.9999f, 17.05f, 10.5499f, 17.5f, 9.9999f, 17.5f)
                horizontalLineTo(7.4999f)
                curveTo(5.9799f, 17.5f, 4.6099f, 16.88f, 3.6099f, 15.89f)
                curveTo(2.6699f, 14.94f, 2.0599f, 13.65f, 1.9999f, 12.22f)
                curveTo(1.8799f, 9.08f, 4.6199f, 6.5f, 7.7699f, 6.5f)
                horizontalLineTo(9.9999f)
                curveTo(10.5499f, 6.5f, 10.9999f, 6.95f, 10.9999f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9998f, 11.78f)
                curveTo(22.1298f, 14.93f, 19.3898f, 17.5f, 16.2398f, 17.5f)
                horizontalLineTo(14.0098f)
                curveTo(13.4598f, 17.5f, 13.0098f, 17.05f, 13.0098f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(13.0098f, 6.95f, 13.4598f, 6.5f, 14.0098f, 6.5f)
                horizontalLineTo(16.5098f)
                curveTo(18.0298f, 6.5f, 19.3998f, 7.12f, 20.3998f, 8.11f)
                curveTo(21.3298f, 9.06f, 21.9398f, 10.35f, 21.9998f, 11.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 12.75f, 7.25f, 12.41f, 7.25f, 12.0f)
                curveTo(7.25f, 11.59f, 7.59f, 11.25f, 8.0f, 11.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 11.25f, 16.75f, 11.59f, 16.75f, 12.0f)
                curveTo(16.75f, 12.41f, 16.41f, 12.75f, 16.0f, 12.75f)
                close()
            }
        }
        .build()
        return _link1!!
    }

private var _link1: ImageVector? = null
