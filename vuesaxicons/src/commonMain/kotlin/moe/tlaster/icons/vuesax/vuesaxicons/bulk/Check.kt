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

public val BulkGroup.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.0f)
                curveTo(14.59f, 22.0f, 14.25f, 21.66f, 14.25f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(14.25f, 2.34f, 14.59f, 2.0f, 15.0f, 2.0f)
                curveTo(15.41f, 2.0f, 15.75f, 2.34f, 15.75f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(15.75f, 21.66f, 15.41f, 22.0f, 15.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 20.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                curveTo(3.79f, 4.0f, 2.0f, 5.79f, 2.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 18.21f, 3.79f, 20.0f, 6.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                curveTo(20.21f, 4.0f, 22.0f, 5.79f, 22.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 18.21f, 20.21f, 20.0f, 18.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 16.25f)
                curveTo(6.59f, 16.25f, 6.25f, 15.91f, 6.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(6.25f, 8.09f, 6.59f, 7.75f, 7.0f, 7.75f)
                curveTo(7.41f, 7.75f, 7.75f, 8.09f, 7.75f, 8.5f)
                verticalLineTo(15.5f)
                curveTo(7.75f, 15.91f, 7.41f, 16.25f, 7.0f, 16.25f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
