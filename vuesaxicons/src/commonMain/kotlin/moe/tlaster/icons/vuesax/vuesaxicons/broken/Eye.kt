package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0299f, 14.0f)
                curveTo(8.6399f, 13.43f, 8.4199f, 12.74f, 8.4199f, 12.0f)
                curveTo(8.4199f, 10.02f, 10.0199f, 8.42f, 11.9999f, 8.42f)
                curveTo(13.9799f, 8.42f, 15.5799f, 10.02f, 15.5799f, 12.0f)
                curveTo(15.5799f, 13.98f, 13.9799f, 15.58f, 11.9999f, 15.58f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5598f, 5.58f)
                curveTo(15.8698f, 4.38f, 13.9698f, 3.73f, 11.9998f, 3.73f)
                curveTo(8.4698f, 3.73f, 5.1798f, 5.81f, 2.8898f, 9.41f)
                curveTo(1.9898f, 10.82f, 1.9898f, 13.19f, 2.8898f, 14.6f)
                curveTo(5.1798f, 18.2f, 8.4698f, 20.28f, 11.9998f, 20.28f)
                curveTo(15.5298f, 20.28f, 18.8198f, 18.2f, 21.1098f, 14.6f)
                curveTo(22.0098f, 13.19f, 22.0098f, 10.82f, 21.1098f, 9.41f)
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
