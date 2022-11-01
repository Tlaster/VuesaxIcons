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

public val LinearGroup.Omegasquare1: ImageVector
    get() {
        if (_omegasquare1 != null) {
            return _omegasquare1!!
        }
        _omegasquare1 = Builder(name = "Omegasquare1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 16.75f)
                horizontalLineTo(13.9f)
                lineTo(15.52f, 14.96f)
                curveTo(16.32f, 14.07f, 16.76f, 12.94f, 16.76f, 11.78f)
                curveTo(16.76f, 10.58f, 16.26f, 9.43f, 15.37f, 8.58f)
                curveTo(14.48f, 7.73f, 13.27f, 7.25f, 12.0f, 7.25f)
                curveTo(10.74f, 7.25f, 9.53f, 7.73f, 8.63f, 8.58f)
                curveTo(7.74f, 9.43f, 7.24f, 10.58f, 7.24f, 11.78f)
                curveTo(7.24f, 12.95f, 7.68f, 14.08f, 8.48f, 14.96f)
                lineTo(10.1f, 16.75f)
                horizontalLineTo(7.0f)
            }
        }
        .build()
        return _omegasquare1!!
    }

private var _omegasquare1: ImageVector? = null
