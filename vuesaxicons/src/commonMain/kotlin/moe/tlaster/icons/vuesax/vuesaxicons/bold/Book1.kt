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

public val BoldGroup.Book1: ImageVector
    get() {
        if (_book1 != null) {
            return _book1!!
        }
        _book1 = Builder(name = "Book1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 16.0f)
                verticalLineTo(18.5f)
                curveTo(20.5f, 20.43f, 18.93f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(5.07f, 22.0f, 3.5f, 20.43f, 3.5f, 18.5f)
                verticalLineTo(17.85f)
                curveTo(3.5f, 16.28f, 4.78f, 15.0f, 6.35f, 15.0f)
                horizontalLineTo(19.5f)
                curveTo(20.05f, 15.0f, 20.5f, 15.45f, 20.5f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 2.0f)
                horizontalLineTo(8.5f)
                curveTo(4.5f, 2.0f, 3.5f, 3.0f, 3.5f, 7.0f)
                verticalLineTo(14.58f)
                curveTo(4.26f, 13.91f, 5.26f, 13.5f, 6.35f, 13.5f)
                horizontalLineTo(19.5f)
                curveTo(20.05f, 13.5f, 20.5f, 13.05f, 20.5f, 12.5f)
                verticalLineTo(7.0f)
                curveTo(20.5f, 3.0f, 19.5f, 2.0f, 15.5f, 2.0f)
                close()
                moveTo(13.0f, 10.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 10.75f, 7.25f, 10.41f, 7.25f, 10.0f)
                curveTo(7.25f, 9.59f, 7.59f, 9.25f, 8.0f, 9.25f)
                horizontalLineTo(13.0f)
                curveTo(13.41f, 9.25f, 13.75f, 9.59f, 13.75f, 10.0f)
                curveTo(13.75f, 10.41f, 13.41f, 10.75f, 13.0f, 10.75f)
                close()
                moveTo(16.0f, 7.25f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 7.25f, 7.25f, 6.91f, 7.25f, 6.5f)
                curveTo(7.25f, 6.09f, 7.59f, 5.75f, 8.0f, 5.75f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 5.75f, 16.75f, 6.09f, 16.75f, 6.5f)
                curveTo(16.75f, 6.91f, 16.41f, 7.25f, 16.0f, 7.25f)
                close()
            }
        }
        .build()
        return _book1!!
    }

private var _book1: ImageVector? = null
