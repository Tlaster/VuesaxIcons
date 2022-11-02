package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Slider: ImageVector
    get() {
        if (_slider != null) {
            return _slider!!
        }
        _slider = Builder(name = "Slider", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(6.25f, 22.75f, 4.25f, 20.75f, 4.25f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(4.25f, 3.25f, 6.25f, 1.25f, 9.0f, 1.25f)
                horizontalLineTo(15.0f)
                curveTo(17.75f, 1.25f, 19.75f, 3.25f, 19.75f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(19.75f, 20.75f, 17.75f, 22.75f, 15.0f, 22.75f)
                close()
                moveTo(9.0f, 2.75f)
                curveTo(6.75f, 2.75f, 5.75f, 4.38f, 5.75f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(5.75f, 19.62f, 6.75f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(17.25f, 21.25f, 18.25f, 19.62f, 18.25f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(18.25f, 4.38f, 17.25f, 2.75f, 15.0f, 2.75f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.76f)
                horizontalLineTo(5.0f)
                curveTo(4.59f, 16.76f, 4.25f, 16.42f, 4.25f, 16.01f)
                curveTo(4.25f, 15.6f, 4.59f, 15.26f, 5.0f, 15.26f)
                horizontalLineTo(19.0f)
                curveTo(19.41f, 15.26f, 19.75f, 15.6f, 19.75f, 16.01f)
                curveTo(19.75f, 16.42f, 19.41f, 16.76f, 19.0f, 16.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 20.75f)
                curveTo(1.59f, 20.75f, 1.25f, 20.41f, 1.25f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(1.25f, 3.59f, 1.59f, 3.25f, 2.0f, 3.25f)
                curveTo(2.41f, 3.25f, 2.75f, 3.59f, 2.75f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.75f, 20.41f, 2.41f, 20.75f, 2.0f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.75f)
                curveTo(21.59f, 20.75f, 21.25f, 20.41f, 21.25f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(21.25f, 3.59f, 21.59f, 3.25f, 22.0f, 3.25f)
                curveTo(22.41f, 3.25f, 22.75f, 3.59f, 22.75f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.75f, 20.41f, 22.41f, 20.75f, 22.0f, 20.75f)
                close()
            }
        }
        .build()
        return _slider!!
    }

private var _slider: ImageVector? = null
