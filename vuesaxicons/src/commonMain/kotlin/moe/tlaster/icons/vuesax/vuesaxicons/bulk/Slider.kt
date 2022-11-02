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

public val BulkGroup.Slider: ImageVector
    get() {
        if (_slider != null) {
            return _slider!!
        }
        _slider = Builder(name = "Slider", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.01f)
                verticalLineTo(18.0f)
                curveTo(19.0f, 20.2f, 17.5f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(6.5f, 22.0f, 5.0f, 20.2f, 5.0f, 18.0f)
                verticalLineTo(16.01f)
                horizontalLineTo(19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                verticalLineTo(16.01f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 3.8f, 6.5f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(17.5f, 2.0f, 19.0f, 3.8f, 19.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 20.75f)
                curveTo(2.59f, 20.75f, 2.25f, 20.41f, 2.25f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.25f, 3.59f, 2.59f, 3.25f, 3.0f, 3.25f)
                curveTo(3.41f, 3.25f, 3.75f, 3.59f, 3.75f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(3.75f, 20.41f, 3.41f, 20.75f, 3.0f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 20.75f)
                curveTo(20.59f, 20.75f, 20.25f, 20.41f, 20.25f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(20.25f, 3.59f, 20.59f, 3.25f, 21.0f, 3.25f)
                curveTo(21.41f, 3.25f, 21.75f, 3.59f, 21.75f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.75f, 20.41f, 21.41f, 20.75f, 21.0f, 20.75f)
                close()
            }
        }
        .build()
        return _slider!!
    }

private var _slider: ImageVector? = null
