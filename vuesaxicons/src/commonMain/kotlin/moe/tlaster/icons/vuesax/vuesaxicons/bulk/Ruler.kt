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

public val BulkGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 17.0f)
                horizontalLineTo(19.0f)
                curveTo(20.66f, 17.0f, 22.0f, 15.66f, 22.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(22.0f, 8.34f, 20.66f, 7.0f, 19.0f, 7.0f)
                horizontalLineTo(5.0f)
                curveTo(3.34f, 7.0f, 2.0f, 8.34f, 2.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 15.66f, 3.34f, 17.0f, 5.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.75f, 7.0f)
                verticalLineTo(12.0f)
                curveTo(18.75f, 12.41f, 18.41f, 12.75f, 18.0f, 12.75f)
                curveTo(17.59f, 12.75f, 17.25f, 12.41f, 17.25f, 12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 7.0f)
                verticalLineTo(10.8f)
                curveTo(6.75f, 11.21f, 6.41f, 11.55f, 6.0f, 11.55f)
                curveTo(5.59f, 11.55f, 5.25f, 11.21f, 5.25f, 10.8f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.79f, 7.0f)
                lineTo(10.75f, 12.01f)
                curveTo(10.75f, 12.42f, 10.41f, 12.75f, 10.0f, 12.75f)
                curveTo(10.0f, 12.75f, 10.0f, 12.75f, 9.99f, 12.75f)
                curveTo(9.58f, 12.75f, 9.25f, 12.41f, 9.25f, 11.99f)
                lineTo(9.29f, 7.0f)
                horizontalLineTo(10.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.75f, 7.0f)
                verticalLineTo(9.6f)
                curveTo(14.75f, 10.01f, 14.41f, 10.35f, 14.0f, 10.35f)
                curveTo(13.59f, 10.35f, 13.25f, 10.01f, 13.25f, 9.6f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.75f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
