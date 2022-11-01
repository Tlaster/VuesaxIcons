package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(name = "Pause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.65f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(10.65f, 3.54f, 10.08f, 3.0f, 8.64f, 3.0f)
                horizontalLineTo(5.01f)
                curveTo(3.57f, 3.0f, 3.0f, 3.54f, 3.0f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(3.0f, 20.46f, 3.57f, 21.0f, 5.01f, 21.0f)
                horizontalLineTo(8.64f)
                curveTo(10.08f, 21.0f, 10.65f, 20.46f, 10.65f, 19.11f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(21.0f, 3.54f, 20.43f, 3.0f, 18.99f, 3.0f)
                horizontalLineTo(15.36f)
                curveTo(13.93f, 3.0f, 13.35f, 3.54f, 13.35f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(13.35f, 20.46f, 13.92f, 21.0f, 15.36f, 21.0f)
                horizontalLineTo(18.99f)
                curveTo(20.43f, 21.0f, 21.0f, 20.46f, 21.0f, 19.11f)
                close()
            }
        }
        .build()
        return _pause!!
    }

private var _pause: ImageVector? = null
