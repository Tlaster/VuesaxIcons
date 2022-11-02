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

public val BulkGroup.Note: ImageVector
    get() {
        if (_note != null) {
            return _note!!
        }
        _note = Builder(name = "Note", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 8.25f)
                verticalLineTo(18.0f)
                curveTo(20.0f, 21.0f, 18.21f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(5.79f, 22.0f, 4.0f, 21.0f, 4.0f, 18.0f)
                verticalLineTo(8.25f)
                curveTo(4.0f, 5.0f, 5.79f, 4.25f, 8.0f, 4.25f)
                curveTo(8.0f, 4.87f, 8.25f, 5.43f, 8.66f, 5.84f)
                curveTo(9.07f, 6.25f, 9.63f, 6.5f, 10.25f, 6.5f)
                horizontalLineTo(13.75f)
                curveTo(14.99f, 6.5f, 16.0f, 5.49f, 16.0f, 4.25f)
                curveTo(18.21f, 4.25f, 20.0f, 5.0f, 20.0f, 8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.25f)
                curveTo(16.0f, 5.49f, 14.99f, 6.5f, 13.75f, 6.5f)
                horizontalLineTo(10.25f)
                curveTo(9.63f, 6.5f, 9.07f, 6.25f, 8.66f, 5.84f)
                curveTo(8.25f, 5.43f, 8.0f, 4.87f, 8.0f, 4.25f)
                curveTo(8.0f, 3.01f, 9.01f, 2.0f, 10.25f, 2.0f)
                horizontalLineTo(13.75f)
                curveTo(14.37f, 2.0f, 14.93f, 2.25f, 15.34f, 2.66f)
                curveTo(15.75f, 3.07f, 16.0f, 3.63f, 16.0f, 4.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 13.75f, 7.25f, 13.41f, 7.25f, 13.0f)
                curveTo(7.25f, 12.59f, 7.59f, 12.25f, 8.0f, 12.25f)
                horizontalLineTo(12.0f)
                curveTo(12.41f, 12.25f, 12.75f, 12.59f, 12.75f, 13.0f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12.0f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 17.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 17.75f, 7.25f, 17.41f, 7.25f, 17.0f)
                curveTo(7.25f, 16.59f, 7.59f, 16.25f, 8.0f, 16.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 16.25f, 16.75f, 16.59f, 16.75f, 17.0f)
                curveTo(16.75f, 17.41f, 16.41f, 17.75f, 16.0f, 17.75f)
                close()
            }
        }
        .build()
        return _note!!
    }

private var _note: ImageVector? = null
