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

public val LinearGroup.Blend: ImageVector
    get() {
        if (_blend != null) {
            return _blend!!
        }
        _blend = Builder(name = "Blend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.97f, 12.0f)
                curveTo(21.97f, 15.31f, 19.28f, 18.0f, 15.97f, 18.0f)
                curveTo(14.43f, 18.0f, 13.03f, 17.42f, 11.97f, 16.46f)
                curveTo(13.2f, 15.37f, 13.97f, 13.77f, 13.97f, 12.0f)
                curveTo(13.97f, 10.23f, 13.2f, 8.63f, 11.97f, 7.54f)
                curveTo(13.03f, 6.58f, 14.43f, 6.0f, 15.97f, 6.0f)
                curveTo(19.28f, 6.0f, 21.97f, 8.69f, 21.97f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.97f, 12.0f)
                curveTo(13.97f, 13.77f, 13.2f, 15.37f, 11.97f, 16.46f)
                curveTo(10.91f, 17.42f, 9.51f, 18.0f, 7.97f, 18.0f)
                curveTo(4.66f, 18.0f, 1.97f, 15.31f, 1.97f, 12.0f)
                curveTo(1.97f, 8.69f, 4.66f, 6.0f, 7.97f, 6.0f)
                curveTo(9.51f, 6.0f, 10.91f, 6.58f, 11.97f, 7.54f)
                curveTo(13.2f, 8.63f, 13.97f, 10.23f, 13.97f, 12.0f)
                close()
            }
        }
        .build()
        return _blend!!
    }

private var _blend: ImageVector? = null
