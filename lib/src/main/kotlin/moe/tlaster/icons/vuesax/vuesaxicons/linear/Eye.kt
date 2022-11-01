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

public val LinearGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.58f, 12.0f)
                curveTo(15.58f, 13.98f, 13.98f, 15.58f, 12.0f, 15.58f)
                curveTo(10.02f, 15.58f, 8.42f, 13.98f, 8.42f, 12.0f)
                curveTo(8.42f, 10.02f, 10.02f, 8.42f, 12.0f, 8.42f)
                curveTo(13.98f, 8.42f, 15.58f, 10.02f, 15.58f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 20.27f)
                curveTo(15.53f, 20.27f, 18.82f, 18.19f, 21.11f, 14.59f)
                curveTo(22.01f, 13.18f, 22.01f, 10.81f, 21.11f, 9.4f)
                curveTo(18.82f, 5.8f, 15.53f, 3.72f, 12.0f, 3.72f)
                curveTo(8.47f, 3.72f, 5.18f, 5.8f, 2.89f, 9.4f)
                curveTo(1.99f, 10.81f, 1.99f, 13.18f, 2.89f, 14.59f)
                curveTo(5.18f, 18.19f, 8.47f, 20.27f, 12.0f, 20.27f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
