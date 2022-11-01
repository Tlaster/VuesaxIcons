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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Paintbucket: ImageVector
    get() {
        if (_paintbucket != null) {
            return _paintbucket!!
        }
        _paintbucket = Builder(name = "Paintbucket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                        strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(3.77f, 15.56f)
                    lineTo(7.23f, 19.02f)
                    curveTo(9.66f, 21.45f, 10.49f, 21.41f, 12.89f, 19.02f)
                    lineTo(18.46f, 13.45f)
                    curveTo(20.4f, 11.51f, 20.89f, 10.22f, 18.46f, 7.79f)
                    lineTo(15.0f, 4.33f)
                    curveTo(12.41f, 1.74f, 11.28f, 2.39f, 9.34f, 4.33f)
                    lineTo(3.77f, 9.9f)
                    curveTo(1.38f, 12.3f, 1.18f, 12.97f, 3.77f, 15.56f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                        strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(19.2f, 16.79f)
                    lineTo(18.54f, 17.88f)
                    curveTo(17.61f, 19.43f, 18.33f, 20.7f, 20.14f, 20.7f)
                    curveTo(21.95f, 20.7f, 22.67f, 19.43f, 21.74f, 17.88f)
                    lineTo(21.08f, 16.79f)
                    curveTo(20.56f, 15.93f, 19.71f, 15.93f, 19.2f, 16.79f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                        strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(2.0f, 12.2401f)
                    curveTo(7.56f, 10.7301f, 13.42f, 10.6801f, 19.0f, 12.1101f)
                    lineTo(19.5f, 12.2401f)
                }
            }
        }
        .build()
        return _paintbucket!!
    }

private var _paintbucket: ImageVector? = null
