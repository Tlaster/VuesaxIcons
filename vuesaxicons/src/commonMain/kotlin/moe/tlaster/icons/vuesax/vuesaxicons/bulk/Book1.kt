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

public val BulkGroup.Book1: ImageVector
    get() {
        if (_book1 != null) {
            return _book1!!
        }
        _book1 = Builder(name = "Book1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5f, 7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.35f)
                curveTo(4.78f, 15.0f, 3.5f, 16.28f, 3.5f, 17.85f)
                verticalLineTo(7.0f)
                curveTo(3.5f, 3.0f, 4.5f, 2.0f, 8.5f, 2.0f)
                horizontalLineTo(15.5f)
                curveTo(19.5f, 2.0f, 20.5f, 3.0f, 20.5f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 15.0f)
                verticalLineTo(18.5f)
                curveTo(20.5f, 20.43f, 18.93f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(5.07f, 22.0f, 3.5f, 20.43f, 3.5f, 18.5f)
                verticalLineTo(17.85f)
                curveTo(3.5f, 16.28f, 4.78f, 15.0f, 6.35f, 15.0f)
                horizontalLineTo(20.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 7.75f, 7.25f, 7.41f, 7.25f, 7.0f)
                curveTo(7.25f, 6.59f, 7.59f, 6.25f, 8.0f, 6.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 6.25f, 16.75f, 6.59f, 16.75f, 7.0f)
                curveTo(16.75f, 7.41f, 16.41f, 7.75f, 16.0f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 11.25f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 11.25f, 7.25f, 10.91f, 7.25f, 10.5f)
                curveTo(7.25f, 10.09f, 7.59f, 9.75f, 8.0f, 9.75f)
                horizontalLineTo(13.0f)
                curveTo(13.41f, 9.75f, 13.75f, 10.09f, 13.75f, 10.5f)
                curveTo(13.75f, 10.91f, 13.41f, 11.25f, 13.0f, 11.25f)
                close()
            }
        }
        .build()
        return _book1!!
    }

private var _book1: ImageVector? = null
