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

public val OutlineGroup.Framer: ImageVector
    get() {
        if (_framer != null) {
            return _framer!!
        }
        _framer = Builder(name = "Framer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.75f)
                horizontalLineTo(5.0f)
                curveTo(4.59f, 16.75f, 4.25f, 16.41f, 4.25f, 16.0f)
                verticalLineTo(9.0f)
                curveTo(4.25f, 8.59f, 4.59f, 8.25f, 5.0f, 8.25f)
                horizontalLineTo(10.19f)
                lineTo(4.47f, 2.53f)
                curveTo(4.26f, 2.32f, 4.19f, 1.99f, 4.31f, 1.71f)
                curveTo(4.43f, 1.43f, 4.7f, 1.25f, 5.0f, 1.25f)
                horizontalLineTo(19.0f)
                curveTo(19.41f, 1.25f, 19.75f, 1.59f, 19.75f, 2.0f)
                verticalLineTo(9.0f)
                curveTo(19.75f, 9.41f, 19.41f, 9.75f, 19.0f, 9.75f)
                horizontalLineTo(13.81f)
                lineTo(19.53f, 15.47f)
                curveTo(19.74f, 15.68f, 19.81f, 16.01f, 19.69f, 16.29f)
                curveTo(19.57f, 16.57f, 19.3f, 16.75f, 19.0f, 16.75f)
                close()
                moveTo(5.75f, 15.25f)
                horizontalLineTo(17.19f)
                lineTo(11.69f, 9.75f)
                horizontalLineTo(5.75f)
                verticalLineTo(15.25f)
                close()
                moveTo(12.31f, 8.25f)
                horizontalLineTo(18.25f)
                verticalLineTo(2.75f)
                horizontalLineTo(6.81f)
                lineTo(12.31f, 8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 22.75f)
                curveTo(11.8201f, 22.75f, 11.6502f, 22.69f, 11.5102f, 22.57f)
                lineTo(4.5101f, 16.57f)
                curveTo(4.2702f, 16.37f, 4.1901f, 16.03f, 4.2902f, 15.74f)
                curveTo(4.4001f, 15.45f, 4.6801f, 15.25f, 4.9901f, 15.25f)
                horizontalLineTo(11.9901f)
                curveTo(12.4001f, 15.25f, 12.7401f, 15.59f, 12.7401f, 16.0f)
                verticalLineTo(22.0f)
                curveTo(12.7401f, 22.29f, 12.5701f, 22.56f, 12.3001f, 22.68f)
                curveTo(12.2101f, 22.73f, 12.1101f, 22.75f, 12.0001f, 22.75f)
                close()
                moveTo(7.0301f, 16.75f)
                lineTo(11.2501f, 20.37f)
                verticalLineTo(16.75f)
                horizontalLineTo(7.0301f)
                close()
            }
        }
        .build()
        return _framer!!
    }

private var _framer: ImageVector? = null
