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

public val BulkGroup.Alignhorizontally: ImageVector
    get() {
        if (_alignhorizontally != null) {
            return _alignhorizontally!!
        }
        _alignhorizontally = Builder(name = "Alignhorizontally", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 17.4f)
                verticalLineTo(6.6f)
                curveTo(4.75f, 5.1f, 5.39f, 4.5f, 6.98f, 4.5f)
                horizontalLineTo(8.02f)
                curveTo(9.61f, 4.5f, 10.25f, 5.1f, 10.25f, 6.6f)
                verticalLineTo(17.4f)
                curveTo(10.25f, 18.9f, 9.61f, 19.5f, 8.02f, 19.5f)
                horizontalLineTo(6.98f)
                curveTo(5.39f, 19.5f, 4.75f, 18.9f, 4.75f, 17.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 12.75f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 12.75f, 2.0f, 12.41f, 2.0f, 12.0f)
                curveTo(2.0f, 11.59f, 2.34f, 11.25f, 2.75f, 11.25f)
                horizontalLineTo(4.75f)
                verticalLineTo(12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.25f, 11.25f)
                horizontalLineTo(10.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(13.25f)
                verticalLineTo(11.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 12.75f)
                horizontalLineTo(18.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(21.25f)
                curveTo(21.66f, 11.25f, 22.0f, 11.59f, 22.0f, 12.0f)
                curveTo(22.0f, 12.41f, 21.66f, 12.75f, 21.25f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.25f, 15.4f)
                verticalLineTo(8.6f)
                curveTo(13.25f, 7.1f, 13.89f, 6.5f, 15.48f, 6.5f)
                horizontalLineTo(16.52f)
                curveTo(18.11f, 6.5f, 18.75f, 7.1f, 18.75f, 8.6f)
                verticalLineTo(15.4f)
                curveTo(18.75f, 16.9f, 18.11f, 17.5f, 16.52f, 17.5f)
                horizontalLineTo(15.48f)
                curveTo(13.89f, 17.5f, 13.25f, 16.9f, 13.25f, 15.4f)
                close()
            }
        }
        .build()
        return _alignhorizontally!!
    }

private var _alignhorizontally: ImageVector? = null
