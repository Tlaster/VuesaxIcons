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

public val BoldGroup.Category: ImageVector
    get() {
        if (_category != null) {
            return _category!!
        }
        _category = Builder(name = "Category", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.24f, 2.0f)
                horizontalLineTo(5.34f)
                curveTo(3.15f, 2.0f, 2.0f, 3.15f, 2.0f, 5.33f)
                verticalLineTo(7.23f)
                curveTo(2.0f, 9.41f, 3.15f, 10.56f, 5.33f, 10.56f)
                horizontalLineTo(7.23f)
                curveTo(9.41f, 10.56f, 10.56f, 9.41f, 10.56f, 7.23f)
                verticalLineTo(5.33f)
                curveTo(10.57f, 3.15f, 9.42f, 2.0f, 7.24f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6695f, 2.0f)
                horizontalLineTo(16.7695f)
                curveTo(14.5895f, 2.0f, 13.4395f, 3.15f, 13.4395f, 5.33f)
                verticalLineTo(7.23f)
                curveTo(13.4395f, 9.41f, 14.5895f, 10.56f, 16.7695f, 10.56f)
                horizontalLineTo(18.6695f)
                curveTo(20.8495f, 10.56f, 21.9995f, 9.41f, 21.9995f, 7.23f)
                verticalLineTo(5.33f)
                curveTo(21.9995f, 3.15f, 20.8495f, 2.0f, 18.6695f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6695f, 13.4297f)
                horizontalLineTo(16.7695f)
                curveTo(14.5895f, 13.4297f, 13.4395f, 14.5797f, 13.4395f, 16.7597f)
                verticalLineTo(18.6597f)
                curveTo(13.4395f, 20.8397f, 14.5895f, 21.9897f, 16.7695f, 21.9897f)
                horizontalLineTo(18.6695f)
                curveTo(20.8495f, 21.9897f, 21.9995f, 20.8397f, 21.9995f, 18.6597f)
                verticalLineTo(16.7597f)
                curveTo(21.9995f, 14.5797f, 20.8495f, 13.4297f, 18.6695f, 13.4297f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.24f, 13.4297f)
                horizontalLineTo(5.34f)
                curveTo(3.15f, 13.4297f, 2.0f, 14.5797f, 2.0f, 16.7597f)
                verticalLineTo(18.6597f)
                curveTo(2.0f, 20.8497f, 3.15f, 21.9997f, 5.33f, 21.9997f)
                horizontalLineTo(7.23f)
                curveTo(9.41f, 21.9997f, 10.56f, 20.8497f, 10.56f, 18.6697f)
                verticalLineTo(16.7697f)
                curveTo(10.57f, 14.5797f, 9.42f, 13.4297f, 7.24f, 13.4297f)
                close()
            }
        }
        .build()
        return _category!!
    }

private var _category: ImageVector? = null
