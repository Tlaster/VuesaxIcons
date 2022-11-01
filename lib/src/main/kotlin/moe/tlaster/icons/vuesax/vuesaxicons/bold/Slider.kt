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

public val BoldGroup.Slider: ImageVector
    get() {
        if (_slider != null) {
            return _slider!!
        }
        _slider = Builder(name = "Slider", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 16.0117f)
                curveTo(18.55f, 16.0117f, 19.0f, 16.4617f, 19.0f, 17.0117f)
                verticalLineTo(18.0017f)
                curveTo(19.0f, 20.2017f, 17.5f, 22.0017f, 15.0f, 22.0017f)
                horizontalLineTo(9.0f)
                curveTo(6.5f, 22.0017f, 5.0f, 20.2017f, 5.0f, 18.0017f)
                verticalLineTo(17.0117f)
                curveTo(5.0f, 16.4617f, 5.45f, 16.0117f, 6.0f, 16.0117f)
                horizontalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                verticalLineTo(13.5f)
                curveTo(19.0f, 14.05f, 18.55f, 14.5f, 18.0f, 14.5f)
                horizontalLineTo(6.0f)
                curveTo(5.45f, 14.5f, 5.0f, 14.05f, 5.0f, 13.5f)
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
